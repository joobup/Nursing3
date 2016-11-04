package generate;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;



public class GenerateService {

    public static void Generate(String ftlPath, String ftlName,
                                String fileName, String filePath, String packageName,
                                String daopackageName, String modelpackageName) throws IOException, TemplateException {

        String ImplFilePath = filePath + "\\impl";
        PathUtil.Path_Judge_Exist(ftlPath);
        PathUtil.Path_Judge_Exist(filePath);
        PathUtil.Path_Judge_Exist(ImplFilePath);

        //实体类需要其他参数
        Map<String, Object> root = new HashMap<String, Object>();
        root.put("modelpackageName", modelpackageName);
        root.put("daopackageName", daopackageName);
        root.put("packageName", packageName);

        if(fileName.split(",").length==1){
            root.put("className", fileName);
            root.put("level",false);
        }else{
            root.put("className", fileName.split(",")[0]);
            root.put("level",true);
            root.put("classLevelName",fileName.split(",")[1]);
            root.put("classTidName",fileName.split(",")[2]);
        }

        root.put("implflag", false);

        Configuration cfg = new Configuration();
        String path = System.getProperty("user.dir") + ftlPath;

        cfg.setDirectoryForTemplateLoading(new File(path));
        Template template = cfg.getTemplate(ftlName);

        PathUtil.printFile(root, template, filePath, fileName.split(",")[0] + "Service");

        //生成Impl文件
        root.put("ImplpackageName", packageName + "." + fileName.split(",")[0] + "Service");
        root.put("packageName", packageName + ".impl");
        root.put("implflag", true);
        PathUtil.printFile(root, template, ImplFilePath, fileName.split(",")[0] + "ServiceImpl");

    }

    public static void main(String[] args) throws IOException, TemplateException {


        String[] fileNames = new String[]{
//					"Nurseify,NursifyLevel,NursifyTid",
//					"Services",
//					"ServicesPicture",
//					"ServiceClasses,ServeClasslevel,Tid",
//					"ServicePackPicture",
//					"ServicePack",
//					"StaffDepartment",
//					"StaffPost",
//					"ServiceStaff",
//					"ServiceClassesValuation",
//					"ServiceClassesValuationRelation",


                //"CommentPicture"
                //"CommentRichText"

                //"ServicePackItem"
                //"StaffServiceItem"
//                    "Entrance",
//                    "Room",
//                    "RoomType,RoomTypeLeave,Tid",
//                    "BedType,BedTypeLeave,Tid",
//                    "BedTypePrice"


//					"Dishes",
//					"DishesPicture",
//					"DishesTypeDishes",
//					"DishesType",
//					"DishesMeterial",
//					"FoodMaterial",
//					"Nutriment",
//					"FoodMaterialNutriment",
//					"WeekFood",
//					"WeekFoodDishes"

//					"InspectionItem",
//					"InspectionItemSelectValue",
//					"Inspection",
//					"InspectionItemInspection",
//
//                "ServicePeople",
//
//                "ServicePeopleType,ServiceTypePeopleLevel,Tid",
//                "ServicePeopleState,ServicePeopleStateLevel,Tid",
//                "ServicePeopleRegister"
//
//                "Contact",
//                "ContactLogin"









//                "ServiceOrder",
//                "ServiceCommonOrder",
//                "ServiceOrderUser",
//                "Evaluate",
//                "PackageServiceEvaluate",
//                "OrderEvaluate",
//                "ExceptionType,ExceptionTypeLevel,Tid",
//                "Complaint",
//                "ComplaintEvent,ComplaintEventLevel,Tid"



        };
        for (String fileName : fileNames
                ) {
            GenerateService.Generate(
                    "\\WebModule\\src\\test\\java\\ftl",
                    "service.ftl",
                    fileName,
                    //"\\Order\\src\\main\\java\\com\\idea\\nursing\\order\\web\\service",
                    //"\\Personal\\src\\main\\java\\com\\idea\\nursing\\personal\\web\\service",
                    "\\OldPeople\\src\\main\\java\\com\\idea\\nursing\\oldpeople\\web\\service",
                    //"\\Inspection\\src\\main\\java\\com\\idea\\nursing\\inspection\\web\\service",
                    //"\\FoodModule\\src\\main\\java\\com\\idea\\nursing\\food\\web\\service",
                    //"\\BedModule\\src\\main\\java\\com\\idea\\nursing\\bed\\web\\service",
                    //"\\ServiceModule\\src\\main\\java\\com\\idea\\nursing\\servicemodule\\web\\service",
                    //"\\src\\main\\java\\com\\idea\\nursing\\common\\web\\service",
                    //"\\Commom\\src\\main\\java\\com\\idea\\nursing\\common\\web\\service",
//						"com.idea.nursing.servicemodule.web.service",
//						"com.idea.nursing.servicemodule.web.dao",
//						"com.idea.nursing.servicemodule.web.domain.pojo"
//						"com.idea.nursing.common.web.service",
//						"com.idea.nursing.common.web.dao",
//						"com.idea.nursing.common.web.domain.pojo"
//                        "com.idea.nursing.bed.web.service",
//                        "com.idea.nursing.bed.web.dao",
//                        "com.idea.nursing.bed.web.domain.pojo"
//						"com.idea.nursing.food.web.service",
//						"com.idea.nursing.food.web.dao",
//						"com.idea.nursing.food.web.domain.pojo"
//						"com.idea.nursing.inspection.web.service",
//						"com.idea.nursing.inspection.web.dao",
//						"com.idea.nursing.inspection.web.domain.pojo"
                    "com.idea.nursing.oldpeople.web.service",
                    "com.idea.nursing.oldpeople.web.dao",
                    "com.idea.nursing.oldpeople.web.domain.pojo"
//                    "com.idea.nursing.personal.web.service",
//                    "com.idea.nursing.personal.web.dao",
//                    "com.idea.nursing.personal.web.domain.pojo"
//                    "com.idea.nursing.order.web.service",
//                    "com.idea.nursing.order.web.dao",
//                    "com.idea.nursing.order.web.domain.pojo"
            );
        }

    }
}
