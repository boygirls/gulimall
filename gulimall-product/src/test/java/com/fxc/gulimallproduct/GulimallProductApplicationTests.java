package com.fxc.gulimallproduct;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fxc.gulimallproduct.entity.PmsBrandEntity;
import com.fxc.gulimallproduct.service.PmsBrandService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {

    @Autowired
    PmsBrandService brandService;

   // @Autowired
   // OSS ossClient;


//    @Test
//    public void test(){
//        // Endpoint以华东1（杭州）为例，其它Region请按实际情况填写。
//        String endpoint = "oss-cn-fuzhou.aliyuncs.com";
//        // 阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维，请登录RAM控制台创建RAM用户。
//        String accessKeyId = "LTAI5tChZp47YiuWNLChLepq";
//        String accessKeySecret = "hpzjkNXS9DLvTIwqLInNkUGIqDKjDq";
//        // 填写Bucket名称，例如examplebucket。
//        String bucketName = "fxcbucket";
//        // 填写Object完整路径，完整路径中不能包含Bucket名称，例如exampledir/exampleobject.txt。
//        String objectName = "head.jpg";
//
//        // 填写本地文件的完整路径，例如D:\\localpath\\examplefile.txt。
//        // 如果未指定本地路径，则默认从示例程序所属项目对应本地路径中上传文件流。
//        String filePath= "C:\\Users\\FDL\\Pictures\\5.jpg";
//
//        // 创建OSSClient实例。
//         OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
//
//        try {
//            InputStream inputStream = new FileInputStream(filePath);
//            // 创建PutObject请求。
//            ossClient.putObject(bucketName, objectName, inputStream);
//        } catch (OSSException oe) {
//            System.out.println("Caught an OSSException, which means your request made it to OSS, "
//                    + "but was rejected with an error response for some reason.");
//            System.out.println("Error Message:" + oe.getErrorMessage());
//            System.out.println("Error Code:" + oe.getErrorCode());
//            System.out.println("Request ID:" + oe.getRequestId());
//            System.out.println("Host ID:" + oe.getHostId());
//        } catch (ClientException ce) {
//            System.out.println("Caught an ClientException, which means the client encountered "
//                    + "a serious internal problem while trying to communicate with OSS, "
//                    + "such as not being able to access the network.");
//            System.out.println("Error Message:" + ce.getMessage());
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } finally {
//            if (ossClient != null) {
//                ossClient.shutdown();
//            }
//        }
//
//    }


    @Test
    public void contextLoads() {

//        PmsBrandEntity brandEntity = new PmsBrandEntity();
//
//        brandEntity.setName("公司");
//        brandService.save(brandEntity);
//        System.out.println("保存成功");

        List<PmsBrandEntity> brand_id = brandService.list(new QueryWrapper<PmsBrandEntity>().eq("brand_id", 1L));

        brand_id.forEach((item)->{
            System.out.println(item);
        });
    }

}
