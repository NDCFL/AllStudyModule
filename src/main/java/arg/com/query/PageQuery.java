package arg.com.query;

/**
 * 分页查询对象
 * 创建于2017-08-23
 *
 * @author 陈飞龙
 * @version 1.0
 */
public class PageQuery {

    private Integer pageNo;
    private Integer pageSize;

    public PageQuery(){}

    public PageQuery(Integer pageNo, Integer pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public int getBeginIndex() {
        return (pageNo - 1) * pageSize;
    }
}
