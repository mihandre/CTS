package ro.ase.acs.cts.laborator3.refactor.phase1;

import ro.ase.acs.cts.laborator3.refactor.exceptions.InvalidAgeException;
import ro.ase.acs.cts.laborator3.refactor.exceptions.InvalidPriceException;

public class Product {
	
	public static final int MAX_AGE_ACCOUNT = 10;
	public static final float MAX_FIDELITY_DISCOUNT = 0.15f;
	
	public static float getDiscountValue(float price, float discount) {
		return discount * price;
	}
	
	private static float getPriceWithDiscountAndFidelity(float price, float discountValue, float fidelityDiscount) {
		return (price - discountValue) * (1 - fidelityDiscount);
	}
	
	private static float getFidelityDiscount(int accountAge) {
		return (accountAge > 10) ? (float)15/100 : (float)accountAge/100;
	}
	
	private static float getFinalPrice(float price, float fidelityDiscount, ProductType type) {
		float discountValue = getDiscountValue(price, type.getDiscount());
		float finalPrice = getPriceWithDiscountAndFidelity(price, discountValue, fidelityDiscount);
		return finalPrice;
	}
	
	public float computePriceWithDiscount(ProductType productType, float initialPrice, int accountAge) throws InvalidAgeException, InvalidPriceException
	  {
	    if(initialPrice<=0) {
	    	throw new InvalidPriceException();
	    }
	    if(accountAge <0) {
	    	throw new InvalidAgeException();
	    }
		
		float finalPrice = 0;
	    float fidelityDiscount = (productType == ProductType.NEW) ? 0 : getFidelityDiscount(accountAge);
	   
	    finalPrice = getFinalPrice(initialPrice, fidelityDiscount, ProductType.NEW);
	    
	    return finalPrice;
	  }
	    
}