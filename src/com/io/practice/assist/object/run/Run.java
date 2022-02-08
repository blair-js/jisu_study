package com.io.practice.assist.object.run;

import com.io.practice.assist.object.model.dao.ObjectDao;
import com.io.practice.assist.object.model.dao.ObjectsDao;

public class Run {

	public static void main(String[] args) {

		//ObjectDao o = new ObjectDao();
		ObjectsDao o = new ObjectsDao();
		o.fileSave();
		o.fileOpen();
		
	}

}
