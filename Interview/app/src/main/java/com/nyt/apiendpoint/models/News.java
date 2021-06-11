package com.nyt.apiendpoint.models;

public class News {

    private String id;
    private String uri;
    private String url;
    private String asset_id;
    private String source;
    private String published_date;
    private String updated;
    private String section;
    private String subsection;
    private String nytdsection;
    private String adx_keywords;
    private String column;
    private String byline;
    private String type;
    private String title;
    private String abstractinfo;
    private String columninfo;
    private String des_facet;

    public News(String id, String uri, String url, String asset_id, String source, String published_date, String updated, String section, String subsection, String nytdsection, String adx_keywords, String column, String byline, String type, String title, String abstractinfo, String columninfo, String des_facet) {
        this.id = id;
        this.uri = uri;
        this.url = url;
        this.asset_id = asset_id;
        this.source = source;
        this.published_date = published_date;
        this.updated = updated;
        this.section = section;
        this.subsection = subsection;
        this.nytdsection = nytdsection;
        this.adx_keywords = adx_keywords;
        this.column = column;
        this.byline = byline;
        this.type = type;
        this.title = title;
        this.abstractinfo = abstractinfo;
        this.columninfo = columninfo;
        this.des_facet = des_facet;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAsset_id() {
        return asset_id;
    }

    public void setAsset_id(String asset_id) {
        this.asset_id = asset_id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getPublished_date() {
        return published_date;
    }

    public void setPublished_date(String published_date) {
        this.published_date = published_date;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getSubsection() {
        return subsection;
    }

    public void setSubsection(String subsection) {
        this.subsection = subsection;
    }

    public String getNytdsection() {
        return nytdsection;
    }

    public void setNytdsection(String nytdsection) {
        this.nytdsection = nytdsection;
    }

    public String getAdx_keywords() {
        return adx_keywords;
    }

    public void setAdx_keywords(String adx_keywords) {
        this.adx_keywords = adx_keywords;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public String getByline() {
        return byline;
    }

    public void setByline(String byline) {
        this.byline = byline;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAbstractinfo() {
        return abstractinfo;
    }

    public void setAbstractinfo(String abstractinfo) {
        this.abstractinfo = abstractinfo;
    }

    public String getColumninfo() {
        return columninfo;
    }

    public void setColumninfo(String columninfo) {
        this.columninfo = columninfo;
    }

    public String getDes_facet() {
        return des_facet;
    }

    public void setDes_facet(String des_facet) {
        this.des_facet = des_facet;
    }
}



