/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gov.gsa.faas.tools.submissionmover;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class SubmissionMoverAppTest {

    // //private test helper function
    // static String readFile(String path, Charset encoding) throws IOException
    // {
    //     byte[] encoded = Files.readAllBytes(Paths.get(path));
    //     return new String(encoded, encoding);
    // }

    private SubmissionMoverApp SubmissionMoverApp;
    private String FORMIO_DEV_PATH = "https://dev-portal.fs.gsa.gov/dev/";
    private String formioDevApiKey = "";

    // private void getPropValues() throws IOException {
 
    //     InputStream inputStream = null;
    //     String propFileName = "formiokeys.env";

	// 	try {
	// 		Properties prop = new Properties();
	// 		inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
 
	// 		if (inputStream != null) {
	// 			prop.load(inputStream);
	// 		} else {
	// 			throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
	// 		}
 
	// 		// get the property value and print it out
	// 		formioDevApiKey = prop.getProperty("FORMIO_DEV_API_KEY");
	// 	} catch (Exception e) {
	// 		System.out.println("Exception: " + e);
	// 	} finally {
    //         if (inputStream != null) {
    //             inputStream.close();
    //         }
	// 	}
	// }

    // @Before
    // public void setUp() throws IOException{
    //     getPropValues();
    //     SubmissionMoverApp = new SubmissionMoverApp(formioDevApiKey, FORMIO_DEV_PATH);
    // }

    // @Test
    // public void testReadFormDefinitionJson() throws IOException, InterruptedException, URISyntaxException {
    //     // Read the form into a JsonNode structure
    //     FormDefinition formDef = SubmissionMoverApp.readFormDefinitionJson("src/test/resources/formDefinitionOutputExample.json");
    //     assertNotNull(formDef.getFormName());
    // }

    // @Test
    // public void testGetRoleIdsByTitle() throws IOException, InterruptedException, URISyntaxException {

    //     //TODO: Mock connection to real form.io server

    //     List<String> validRoles = Arrays.asList("Anonymous", "Administrator", "Authenticated");
    //     List<String> validIds = SubmissionMoverApp.getRoleIdsByTitle(validRoles);
    //     assertEquals("The number of Roles and returned IDs did NOT match", validRoles.size(), validIds.size());
    // }

    // @Test
    // public void testCreateSubmissionAccessJsonWithCreateOwn() throws IOException, InterruptedException, URISyntaxException {

    //     //TODO: Mock connection to real form.io server

    //     List<String> validRoles = Arrays.asList("Anonymous", "Administrator", "Authenticated");

    //     String submissionJson = SubmissionMoverApp.createSubmissionAccessJsonWithCreateOwn(validRoles);

    //     // String sampleSubmissionJson = ""[{"roles":["5f6a32fb7974387e12dc685a","5f6a32fb797438b66edc685c","5f6a32fb797438eb59dc685b"],"type":"create_own"},{"roles":[""],"type":"create_all"},{"roles":[""],"type":"read_own"},{"roles":[""],"type":"read_all"},{"roles":[""],"type":"update_own"},{"roles":[""],"type":"update_all"},{"roles":[""],"type":"delete_own"},{"roles":[""],"type":"delete_all"},{"roles":[""],"type":"team_read"},{"roles":[""],"type":"team_write"},{"roles":[""],"type":"team_admin"}]"";

    //     assertNotNull(submissionJson);
    // }


    // @Test
    // @Ignore("TODO")
    // public void testAddSubmissionAccessToFormDefinition() throws IOException, InterruptedException, URISyntaxException {

    //      //TODO

    //     assertNotNull(SubmissionMoverApp);
    // }

    // @Test
    // @Ignore("TODO")
    // public void testPublishFormJson() throws IOException, InterruptedException, URISyntaxException {

    //     //TODO

    //     assertNotNull(SubmissionMoverApp);
    // }

    // @Test
    // @Ignore("TODO")
    // public void testParseRolesString() throws IOException, InterruptedException, URISyntaxException {

    //     //TODO

    //     assertNotNull(SubmissionMoverApp);
    // }






}
