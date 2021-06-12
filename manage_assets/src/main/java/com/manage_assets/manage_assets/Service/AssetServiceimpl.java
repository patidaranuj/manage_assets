package com.manage_assets.manage_assets.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manage_assets.manage_assets.Dao.AssetDao;
import com.manage_assets.manage_assets.entities.Assets;

@Service
public class AssetServiceimpl implements AssetService {
	
	@Autowired
	private  AssetDao assetDao;
	
	Assets a;
	Assets b;
	

	@Override
	public List<Assets> getAsset() {
		// TODO Auto-generated method stub
		return assetDao.findAll();
	}

	
	@Override
	public Assets getOneAsset(String assetName) {
		List<Assets> assetList=assetDao.findAll();
		for(Assets e:assetList)
		{
			if(e.getName().equals(assetName))
			{
				return e;
			}
		}
		 return a;
	}
	
	@Override
	public Assets addAssets(Assets as) {
		assetDao.save(as);
		return as;
	}
	
	@Override
	public Assets updateAssets(Assets as) {
		assetDao.save(as);
		return as;
	}

	@Override
	public String deleteAssets(String assetName) {
		Assets ast=assetDao.getById(assetName);
		if(ast.getStatus()=="Assigned"|| ast.getStatus()=="ASSIGNED" || ast.getStatus()=="assigned")
		{
			return "Cannot delete this assignd to someone";
		}
		else
		{
			assetDao.deleteById(assetName);
		return "AssetDeleted deleted";
		}
	}

	@Override
	public String assignAssets(String assetName) {
		
		List<Assets> assetList=assetDao.findAll();
		
		for(Assets e:assetList)
		{
			if(e.getName().equals(assetName))
			{
		
				e.setStatus("Assigned");
				assetDao.save(e);
				return "Assigned Successfully";
			}
		}
		
		return "can not assign";
	}

	@Override
	public String recoverAssets(String assetName) {

		List<Assets> assetList=assetDao.findAll();
		
		for(Assets e:assetList)
		{
			if(e.getName().equals(assetName))
			{
		
				e.setStatus("Recovered");
				assetDao.save(e);
				return "Recovered sucess";
			}
		}
		
		return "can not recover";
		
	}


	

	
	

	



		
	

}
