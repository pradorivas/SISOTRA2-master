package com.llamagas.sisotra.dao;

import com.llamagas.sisotra.entidad.OrdenTrabajo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author DENIS
 */
public class OrdenTrabajoDaoImpl implements OrdenTrabajoDao {

    @Override
    public void registrar(OrdenTrabajo OrdTra) {
        //Contenedor.ORDEN_TRABAJO.add(OrdTra);//linkedinList
        OrdTra.setEstado("Pendiente");
        Contenedor.ORDEN_TRABAJO.put(OrdTra.getIdOrdenT(), OrdTra); //Map
    }

    @Override
    public void actualizar(OrdenTrabajo OrdTra) {
        Contenedor.ORDEN_TRABAJO.put(OrdTra.getIdOrdenT(), OrdTra);
    }

    @Override
    public void eliminarSegun(OrdenTrabajo OrdTra) {
        //String idOT = OrdTra.getIdOrdenT().trim();
        Contenedor.ORDEN_TRABAJO.remove(OrdTra.getIdOrdenT().trim());
    }

    @Override
    public List<OrdenTrabajo> listarTodo() {
        //return new ArrayList<>(Contenedor.ORDEN_TRABAJO.values());
        Iterator it = Contenedor.ORDEN_TRABAJO.entrySet().iterator();
        List<OrdenTrabajo> lista = new ArrayList<>();
        while (it.hasNext()) {
            Entry<String, OrdenTrabajo> orden = (Entry<String, OrdenTrabajo>) it.next();
            lista.add(orden.getValue());
        }
        return lista;
    }

    @Override
    public void Asignar(OrdenTrabajo OrdTra) {
        OrdTra.setEstado("Abierto");
        Contenedor.ORDEN_TRABAJO.put(OrdTra.getIdOrdenT(), OrdTra);
    }

    private static class Contenedor {
        // private static List<OrdenTrabajo> ddd = new LinkedList<OrdenTrabajo>();
        private static Map ORDEN_TRABAJO = new HashMap<>();
    }
}
