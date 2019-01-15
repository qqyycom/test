package test.poi;


import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import cn.afterturn.easypoi.excel.entity.result.ExcelImportResult;

import java.io.File;
import java.util.Map;

/**
 * 描述：
 *
 * @Auther: qgm
 * @Date: 2019/1/14 15:57
 */
public class ExcelImportDemo {
//    private static String filePath = "C:\\Users\\admin\\Desktop\\2018-11商家提现名单 (1).xls";
    private static String filePath = "C:\\Users\\admin\\Desktop\\需求\\公关费\\设备折旧表.xlsx";

    public static void main(String[] args) {
        ImportParams params = new ImportParams();
        params.setTitleRows(0);
        params.setHeadRows(1);
        ExcelImportResult<ImportModel> rs =
                ExcelImportUtil.importExcelMore(new File(filePath),ImportModel.class, params);
        for (int i = 0; i < rs.getList().size(); i++) {
            System.out.println(rs.getList().get(i));
        }
    }

}





