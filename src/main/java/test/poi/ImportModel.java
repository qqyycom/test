package test.poi;

import cn.afterturn.easypoi.excel.annotation.Excel;

import java.util.StringJoiner;

/**
 * 描述：
 *
 * @Auther: qgm
 * @Date: 2019/1/15 15:50
 */
public class ImportModel {
//    private int productId;

    @Excel(name = "机器型号")
    private String prodType;

    @Excel(name = "折旧年限")
    private int deadLine;

    @Excel(name = "日度折旧")
    private double dailyDepreciation;

//    public int getProductId() {
//        return productId;
//    }
//
//    public void setProductId(int productId) {
//        this.productId = productId;
//    }

    public String getProdType() {
        return prodType;
    }

    public void setProdType(String prodType) {
        this.prodType = prodType;
    }

    public int getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(int deadLine) {
        this.deadLine = deadLine;
    }

    public double getDailyDepreciation() {
        return dailyDepreciation;
    }

    public void setDailyDepreciation(double dailyDepreciation) {
        this.dailyDepreciation = dailyDepreciation;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ImportModel.class.getSimpleName() + "[", "]")
//                .add("productId=" + productId)
                .add("prodType='" + prodType + "'")
                .add("deadLine=" + deadLine)
                .add("dailyDepreciation=" + dailyDepreciation)
                .toString();
    }
}
