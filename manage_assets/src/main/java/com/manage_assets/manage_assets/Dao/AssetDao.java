package com.manage_assets.manage_assets.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manage_assets.manage_assets.entities.Assets;


public interface AssetDao extends JpaRepository <Assets,String>{

}
