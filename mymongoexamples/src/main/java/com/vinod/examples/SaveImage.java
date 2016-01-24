package com.vinod.examples;

import java.io.File;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;
import com.mongodb.gridfs.GridFSInputFile;

public class SaveImage {

    public static void main(String[] args) {
	try {

	    Mongo mongo = new Mongo("localhost", 27017);
	    DB db = mongo.getDB("imagedb");
	    DBCollection collection = db.getCollection("dummyColl");
	    String newFileName = "myfile";
	    File imageFile = new File("java.jpg");

	    // create a "photo" namespace

	    GridFS gfsPhoto = new GridFS(db, "photo");

	    // get image file from local drive

	    GridFSInputFile gfsFile = gfsPhoto.createFile(imageFile);

	    // set a new filename for identify purpose

	    gfsFile.setFilename(newFileName);

	    // save the image file into mongoDB

	    gfsFile.save();

	    // print the result

	    DBCursor cursor = gfsPhoto.getFileList();

	    while (cursor.hasNext()) {
		System.out.println(cursor.next());
	    }

	    // get image file by it's filename
	    GridFSDBFile imageForOutput = gfsPhoto.findOne(newFileName);
	    // save it into a new image file
	    imageForOutput.writeTo("java1.jpg");
	    // remove the image file from mongoDB
	    gfsPhoto.remove(gfsPhoto.findOne(newFileName));
	    System.out.println("Done");

	} catch (Exception e) {
	    e.printStackTrace();

	}
    }

}
