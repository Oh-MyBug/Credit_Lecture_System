package com.ohmybug.pojo;

import java.util.List;

/**
 * ClassName:   Page
 * Data:        2020/9/2
 * author:      Oh_MyBug
 * version:     V1.0
 */
public class Page<T> {
    public static final Integer PAGE_SIZE = 7;
    private Integer pageNo;
    private Integer pageTotalCount;
    private Integer pageSize;
    private Integer pageTotal;
    private List<T> items;
    private String url;

    public Page(Integer pageNo, Integer pageTotalCount, Integer pageSize, Integer pageTotal, List<T> items) {
        this.pageNo = pageNo;
        this.pageTotalCount = pageTotalCount;
        this.pageSize = pageSize;
        this.pageTotal = pageTotal;
        this.items = items;
    }

    public Page() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageTotal() {
        return pageTotal;
    }

    public void setPageTotal(Integer pageTotal) {
        this.pageTotal = pageTotal;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        pageNo = Math.max(pageNo, 1);
        pageNo = Math.min(pageNo, pageTotal);
        this.pageNo = pageNo;
    }

    public Integer getPageTotalCount() {
        return pageTotalCount;
    }

    public void setPageTotalCount(Integer pageTotalCount) {
        this.pageTotalCount = pageTotalCount;
    }

    @Override
    public String toString() {
        return "Page{" +
                "pageNo=" + pageNo +
                ", pageTotalCount=" + pageTotalCount +
                ", pageSize=" + pageSize +
                ", pageTotal=" + pageTotal +
                ", items=" + items +
                ", url='" + url + '\'' +
                '}';
    }
}
