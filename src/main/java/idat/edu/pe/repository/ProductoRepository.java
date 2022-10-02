package idat.edu.pe.repository;

import java.util.List;

import idat.edu.pe.model.Producto;

public interface ProductoRepository {

	void guardar(Producto producto);
	void actualizar(Producto producto);
	void eliminar(Integer id);
	List<Producto> listar();
	Producto obtener(Integer id);

}
