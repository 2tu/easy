package com.tu.easy.poi.enums;

/**
 * @author Tu enum@foxmail.com.
 */
public enum MSTypeEnum {
  XLS("xls"), XLSX("xlsx"), DOC("doc"), DOCX("docx"), PPT("ppt"), PPTX("pptx"), VSD("vsd"), VSDX("vsdx");
  private String code;

  MSTypeEnum(String code) {
    this.code = code;
  }

  public String getCode() {
    return code;
  }

  public static MSTypeEnum fromCode(String code) {
    String cleanedCode = (code == null ? null : code.toLowerCase());

    for (MSTypeEnum country : values()) {
      if (country.getCode().equals(cleanedCode)) {
        return country;
      }
    }

    return null;
  }
}