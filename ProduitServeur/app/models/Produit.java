package models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.avaje.ebean.PagingList;

import play.db.ebean.Model;
import play.db.ebean.Model.Finder;

@Entity
public class Produit extends Model
{
	@Id
	public long idProduit ;
	public String commentaire ;
	public String name ;
	public Date DateProduction ;
	public Date DatePeremption ;
	
	public static Finder<Long, Produit> find = new Finder<Long, Produit>(Long.class, Produit.class);
	
	public static List<Produit> all()
	{
		return find.all();
	}
	
	public static List<Produit> findByname(String name)
	{
		return find.where().eq("name", name).findList();
	}
	
	public static Produit create(Produit Produit)
	{
		Produit.DateProduction = new Date();
      Produit.DatePeremption = new Date();
    	Produit.save();
    	return Produit;
	}
}
