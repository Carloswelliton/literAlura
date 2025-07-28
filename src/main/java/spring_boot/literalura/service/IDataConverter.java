package spring_boot.literalura.service;

import java.util.List;

public interface IDataConverter {
  <T> T connection(String json, Class<T> clazz);

  <T> List<T> getlist(String json, Class<T> clazz);
}
