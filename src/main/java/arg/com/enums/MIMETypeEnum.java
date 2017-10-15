package arg.com.enums;

/**
 * MIME Type枚举，常用的MIME Type<br />
 * 创建于2017-09-01
 *
 * @author 陈飞龙
 * @version 1.0
 * @see arg.com.enums.ContentTypeEnum
 */
public enum MIMETypeEnum {

    TEXT_PLAIN("text", ".txt", "text/plain"),
    HTML("html", ".html", "text/html"),
    XML("xml", ".xml", "text/xml"),
    JSON("json", ".json", "application/json");

    private String value;
    private String ext;
    private String mime;

    MIMETypeEnum(String value, String ext, String mime) {
        this.value = value;
        this.ext = ext;
        this.mime = mime;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public String getMime() {
        return mime;
    }

    public void setMime(String mime) {
        this.mime = mime;
    }
}
