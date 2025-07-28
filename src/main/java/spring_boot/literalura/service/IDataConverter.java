package spring_boot.literalura.service;

import java.util.List;

public interface IDataConverter {
  <T> T dataConverter(String json, Class<T> clazz);

  <T> List<T> getList(String json, Class<T> clazz);
}
