package generate;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class GenerateController {

    /**
     *
      * @param ftlPath
     * @param ftlName
     * @param fileName2
     * @param filePath
     * @param packageName
     * @param modelpackageName
     * @param servicepackageName
     * @throws IOException
     * @throws TemplateException
     */
    public static void Generate(String ftlPath,
                                String ftlName,
                                String fileName2,
                                String filePath,
                                String packageName,
                                String modelpackageName,
                                String servicepackageName

    ) throws IOException, TemplateException {
        PathUtil.Path_Judge_Exist(ftlPath);
        PathUtil.Path_Judge_Exist(filePath);
        String fileName = fileName2.split(",")[0];
        //实体类需要其他参数
        Map<String, Object> root = new HashMap<String, Object>();

        root.put("modelpackageName", modelpackageName);
        root.put("ImplpackageName", servicepackageName + "." + fileName + "Service");
        root.put("packageName", packageName);
        root.put("className", fileName);

        root.put("urlName", camelToUnderline(fileName));
        root.put("chinaName", fileName2.split(",")[1]);
        Configuration cfg = new Configuration();
        String path = System.getProperty("user.dir") + ftlPath;

        cfg.setDirectoryForTemplateLoading(new File(path));
        Template template = cfg.getTemplate(ftlName);

        PathUtil.printFile(root, template, filePath, fileName+"Controller");
    }
    public static final char UNDERLINE='_';
    public static String camelToUnderline(String param){
        if (param==null||"".equals(param.trim())){
            return "";
        }
        int len=param.length();
        StringBuilder sb=new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            char c=param.charAt(i);
            if(i==0){
                sb.append(c);
            }else{
                if (Character.isUpperCase(c)){

                    sb.append(UNDERLINE);
                    sb.append(Character.toLowerCase(c));
                }else{
                    sb.append(c);
                }
            }

        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String[] fileNames = new String[]{
//                "Nurseify,护理级别",
//                "Services,服务",
//
//                "ServiceClasses,服务类别",
//
//                "ServicePack,服务打包",
//                "StaffDepartment,服务人员职务",
//                "StaffPost,服务人员部门",
//                "ServiceStaff,服务人员",
//                "ServiceClassesValuation,计价类型",
                //"CommentPicture,图片"
                "ServiceClassesValuationRelation,服务计价类型"
                //"CommentRichText,富文本"
               // "ServicePackItem,服务打包服务项"
               // "StaffServiceItem,服务人员服务项目关系"

//                "Entrance,楼门",
//                "Room,房间",
//                "RoomType,房间类型",
//                "BedType,床类别",
//                "BedTypePrice,价格类别表"
//                "Dishes,菜品",
//                "DishesPicture,菜品图片关系",
//                "DishesTypeDishes,菜品类别关系",
//                "DishesType,菜品类别",
//                "DishesMeterial,菜品配料关系",
//                "FoodMaterial,食材配料",
//                "Nutriment,营养物质",
//                "FoodMaterialNutriment,食材配料和营养物质关系",
//                "WeekFood,本周食谱",
//                "WeekFoodDishes,本周食谱菜品关系"
//                "InspectionItem,自定义检查项目表",
//                "InspectionItemSelectValue,检查项目选项值表",
//                "Inspection,检查表",
//                "InspectionItemInspection,检查健康状况项目关系表",
        };
        for (String fileName:fileNames) {


            try {
                GenerateController.Generate(
                        "\\src\\test\\java\\ftl",
                        "controller.ftl",
                        fileName,
                        //"\\Inspection\\src\\main\\java\\com\\idea\\nursing\\inspection\\web\\controller",
                        //"\\FoodModule\\src\\main\\java\\com\\idea\\nursing\\food\\web\\controller",
                        //"\\BedModule\\src\\main\\java\\com\\idea\\nursing\\bed\\web\\controller",
                        "\\ServiceModule\\src\\main\\java\\com\\idea\\nursing\\servicemodule\\web\\controller",
                        //"\\src\\main\\java\\com\\idea\\nursing\\common\\web\\controller",
//                        "com.idea.nursing.common.web.controller",
//                        "com.idea.nursing.common.web.domain.pojo",
//                        "com.idea.nursing.common.web.service"
                        "com.idea.nursing.servicemodule.web.controller",
                        "com.idea.nursing.servicemodule.web.domain.pojo",
                        "com.idea.nursing.servicemodule.web.service"
//                        "com.idea.nursing.common.web.controller",
//                        "com.idea.nursing.common.web.domain.pojo",
//                        "com.idea.nursing.common.web.service"

//                        "com.idea.nursing.bed.web.controller",
//                        "com.idea.nursing.bed.web.domain.pojo",
//                        "com.idea.nursing.bed.web.service"
//                        "com.idea.nursing.food.web.controller",
//                        "com.idea.nursing.food.web.domain.pojo",
//                        "com.idea.nursing.food.web.service"
//                        "com.idea.nursing.inspection.web.controller",
//                        "com.idea.nursing.inspection.web.domain.pojo",
//                        "com.idea.nursing.inspection.web.service"
                        );
            } catch (IOException e) {
                e.printStackTrace();
            } catch (TemplateException e) {
                e.printStackTrace();
            }
        }

    }
}