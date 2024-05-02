package com.example.demo.producto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.demo.categoria.Categoria;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_productos")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="idprod")
	Long id;
		
	@Column(name="descripcion")
	String nombre;
	
	@Column(name="stock")
	String stock;
	
	@Column(name="precio")
	String precio;
		
	@ManyToOne
	@JoinColumn(name = "idcategoria")
	private Categoria categoria;

}
