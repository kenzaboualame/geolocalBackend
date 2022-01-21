package service;


import javax.ejb.Remote;

import beans.Vehicule;
import dao.IDao;

@Remote
public interface VehiculeService extends IDao<Vehicule>{

	
}
