

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import com.mysql.jdbc.Driver;

public class GeneratorSqlmap {
	public void generator(String generatorConfigFilePath) throws Exception{
		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		Class.forName("com.mysql.jdbc.Driver");
		
		//指定 逆向工程配置文件
		File configFile = new File(generatorConfigFilePath); 
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
				callback, warnings);
		myBatisGenerator.generate(null);
 
	}
	
	public static void main(String[] args) throws Exception {
		try {
			GeneratorSqlmap generatorSqlmap = new GeneratorSqlmap();
			//这里要填对配置文件路径
			generatorSqlmap.generator("src/main/resources/baseInfoGeneratorConfig.xml");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.exit(0);
	}

}
