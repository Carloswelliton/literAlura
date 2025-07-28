package spring_boot.literalura.service;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

public class DataConverter implements IDataConverter{

  private ObjectMapper mapper = new ObjectMapper();

  @Override
  public <T> T dataConverter(String json, Class<T> clazz) {
    try {
      return mapper.readValue(json, clazz);
    } catch (JsonProcessingException e) {
      throw new RuntimeException(e.getMessage());
    }
  }

  @Override
  public <T> List<T> getList(String json, Class<T> clazz) {
    CollectionType list = mapper.getTypeFactory().constructCollectionType(List.class, clazz);
    try {
      return mapper.readValue(json, list);
    } catch (JsonProcessingException e) {
      throw new RuntimeException(e.getMessage());
    }
  }
  
}
