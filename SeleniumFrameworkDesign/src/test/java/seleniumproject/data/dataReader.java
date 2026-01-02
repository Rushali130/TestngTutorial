package seleniumproject.data;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import jdk.internal.module.ModuleLoaderMap.Mapper;

public class dataReader {

	public List<HashMap<String, String>> getJsondataToMap(String filepath) throws IOException {
		
		//Read Json to String
		String JsonContent=FileUtils.readFileToString(new File(filepath),  
				StandardCharsets.UTF_8);
	// Convert String JsonContent into HashMap for which we need Jackson dependecies
	
		//String to Hashmap
		ObjectMapper mapper= new ObjectMapper();
		List<HashMap<String , String>> data= mapper.readValue(JsonContent, new TypeReference<List<HashMap<String , String>>>(){
	
	});
		return data;
}
}
