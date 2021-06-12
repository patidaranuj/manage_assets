package com.manage_assets.manage_assets.Service;

import java.util.List;
//import java.util.Optional;


import com.manage_assets.manage_assets.entities.Assets;

public interface AssetService {
	
	
	
	public List<Assets> getAsset();
	
	public Assets getOneAsset(String assetName);
	
	public Assets addAssets(Assets as);
	
	public Assets updateAssets(Assets as);

	public String deleteAssets(String assetName);
	
	public String assignAssets(String assetName);
	
	public String recoverAssets(String assetName);

}
