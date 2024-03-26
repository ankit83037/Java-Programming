package com.ui;
import com.utility.*;
import java.util.*;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		//Fill the UI code
		Bazaar bazaar = new Bazaar();
		
		System.out.println("Enter the no of Policy names you want to store");
		int noOfPolicy = Integer.parseInt(sc.nextLine());
		
		Map<Integer,String> policyMap = new TreeMap<Integer,String>();
		
		bazaar.setPolicyMap(policyMap);
		
		for(int i=0;i<noOfPolicy;i++){
        System.out.println("Enter the Policy ID");
		int policyId = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the Policy Name");
		String policyName = sc.nextLine();
		
		
		bazaar.addPolicyDetails(policyId,policyName);
		}
		
		Map<Integer,String> policyMapList = bazaar.getPolicyMap();
		for(Map.Entry e: policyMapList.entrySet()){
		    System.out.println(e.getKey()+" "+e.getValue());
		}
		
		System.out.println("Enter the policy type to be searched");
		String policyType = sc.nextLine();
		System.out.println(policyType);
		List<Integer> policyList = bazaar.searchBasedOnPolicyType(policyType);
		
		for(Integer policyId: policyList){
		    System.out.println(policyId);
		}
	
		
		
		

	}

}
