package com.example.dao;

import java.util.List;

import com.example.models.Pizza;

public interface PizzaDAO {
	
	public Pizza getPizza(int id);
	public Pizza getPizza(String name);
	public List<Pizza> getAllPizzas();
	public boolean addPizza(Pizza p);
	public boolean updatePizza(Pizza change);
	public boolean deletePizza(int id);


}
