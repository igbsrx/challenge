package jp.styler.challenge;

import com.google.gson.Gson;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import data.endpoint.Constants;
import model.PhotosResponse;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class UnitTesting {


    @Test
    public void isFileRead() throws IOException {


        String json = "{\"photos\":{\"page\":1,\"pages\":2237,\"perpage\":100,\"total\":\"223643\",\"photo\":[{\"id\":\"49532265273\",\"owner\":\"186686453@N05\",\"secret\":\"d04e9c7c6c\",\"server\":\"65535\",\"farm\":66,\"title\":\"SULTHON KEBAB | Call\\/WA : 0852 8034 2504 | Produsen Tortilla Kabupaten Malinau\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532989157\",\"owner\":\"186686453@N05\",\"secret\":\"6276b28dc0\",\"server\":\"65535\",\"farm\":66,\"title\":\"SULTHON KEBAB | Call\\/WA : 0852 8034 2504 | Produsen Tortilla Kabupaten Malang\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532989107\",\"owner\":\"186686453@N05\",\"secret\":\"15aba447c5\",\"server\":\"65535\",\"farm\":66,\"title\":\"SULTHON KEBAB | Call\\/WA : 0852 8034 2504 | Produsen Tortilla Kabupaten Majene\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532989032\",\"owner\":\"186686453@N05\",\"secret\":\"fab621d1f0\",\"server\":\"65535\",\"farm\":66,\"title\":\"SULTHON KEBAB | Call\\/WA : 0852 8034 2504 | Produsen Tortilla Kabupaten Majalengka\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532265063\",\"owner\":\"186686453@N05\",\"secret\":\"9b3d40c4d2\",\"server\":\"65535\",\"farm\":66,\"title\":\"SULTHON KEBAB | Call\\/WA : 0852 8034 2504 | Produsen Tortilla Kabupaten Magelang\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532265098\",\"owner\":\"186686453@N05\",\"secret\":\"7f598ecc66\",\"server\":\"65535\",\"farm\":66,\"title\":\"SULTHON KEBAB | Call\\/WA : 0852 8034 2504 | Produsen Tortilla Kabupaten Mahakam Ulu\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532766391\",\"owner\":\"186686453@N05\",\"secret\":\"9cf4f2c5dd\",\"server\":\"65535\",\"farm\":66,\"title\":\"SULTHON KEBAB | Call\\/WA : 0852 8034 2504 | Produsen Tortilla Kabupaten Luwu\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532988917\",\"owner\":\"186686453@N05\",\"secret\":\"a91c09ec32\",\"server\":\"65535\",\"farm\":66,\"title\":\"SULTHON KEBAB | Call\\/WA : 0852 8034 2504 | Produsen Tortilla Kabupaten Madiun\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532988842\",\"owner\":\"186686453@N05\",\"secret\":\"b7244196d2\",\"server\":\"65535\",\"farm\":66,\"title\":\"SULTHON KEBAB | Call\\/WA : 0852 8034 2504 | Produsen Tortilla Kabupaten Luwu Utara\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532766281\",\"owner\":\"186686453@N05\",\"secret\":\"4ccb850712\",\"server\":\"65535\",\"farm\":66,\"title\":\"SULTHON KEBAB | Call\\/WA : 0852 8034 2504 | Produsen Tortilla Kabupaten Luwu Timur\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532645206\",\"owner\":\"186686453@N05\",\"secret\":\"26e9ec241f\",\"server\":\"65535\",\"farm\":66,\"title\":\"SULTHON KEBAB | Call\\/WA : 0852 8034 2504 | Produsen Tortilla Kabupaten Lumajang\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532142638\",\"owner\":\"186686453@N05\",\"secret\":\"67cd8e2bf4\",\"server\":\"65535\",\"farm\":66,\"title\":\"SULTHON KEBAB | Call\\/WA : 0852 8034 2504 | Produsen Tortilla Kabupaten Lombok Utara\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532645146\",\"owner\":\"186686453@N05\",\"secret\":\"20dab75ac6\",\"server\":\"65535\",\"farm\":66,\"title\":\"SULTHON KEBAB | Call\\/WA : 0852 8034 2504 | Produsen Tortilla Kabupaten Lombok Timur\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532867087\",\"owner\":\"186686453@N05\",\"secret\":\"a819f961b7\",\"server\":\"65535\",\"farm\":66,\"title\":\"SULTHON KEBAB | Call\\/WA : 0852 8034 2504 | Produsen Tortilla Kabupaten Lombok Tengah\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532645046\",\"owner\":\"186686453@N05\",\"secret\":\"dd2c039e5d\",\"server\":\"65535\",\"farm\":66,\"title\":\"SULTHON KEBAB | Call\\/WA : 0852 8034 2504 | Produsen Tortilla Kabupaten Lombok Barat\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532867027\",\"owner\":\"186686453@N05\",\"secret\":\"c54bbd84c9\",\"server\":\"65535\",\"farm\":66,\"title\":\"SULTHON KEBAB | Call\\/WA : 0852 8034 2504 | Produsen Tortilla Kabupaten Lingga\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532644836\",\"owner\":\"186686453@N05\",\"secret\":\"2f11866064\",\"server\":\"65535\",\"farm\":66,\"title\":\"SULTHON KEBAB | Call\\/WA : 0852 8034 2504 | Produsen Tortilla Kabupaten Lembata\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532866917\",\"owner\":\"186686453@N05\",\"secret\":\"6dc80fbea3\",\"server\":\"65535\",\"farm\":66,\"title\":\"SULTHON KEBAB | Call\\/WA : 0852 8034 2504 | Produsen Tortilla Kabupaten Lima Puluh Kota\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532644796\",\"owner\":\"186686453@N05\",\"secret\":\"c497718051\",\"server\":\"65535\",\"farm\":66,\"title\":\"SULTHON KEBAB | Call\\/WA : 0852 8034 2504 | Produsen Tortilla Kabupaten Lebong\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532644706\",\"owner\":\"186686453@N05\",\"secret\":\"b13cfa2a0b\",\"server\":\"65535\",\"farm\":66,\"title\":\"SULTHON KEBAB | Call\\/WA : 0852 8034 2504 | Produsen Tortilla Kabupaten Lebak\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49531950893\",\"owner\":\"186686453@N05\",\"secret\":\"c1983a9dd2\",\"server\":\"65535\",\"farm\":66,\"title\":\"SULTHON KEBAB | Call\\/WA : 0852 8034 2504 | Produsen Tortilla Kabupaten Langkat\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532451921\",\"owner\":\"186686453@N05\",\"secret\":\"d03408c58a\",\"server\":\"65535\",\"farm\":66,\"title\":\"SULTHON KEBAB | Call\\/WA : 0852 8034 2504 | Produsen Tortilla Kabupaten Lanny Jaya\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532676162\",\"owner\":\"186686453@N05\",\"secret\":\"ed49819a78\",\"server\":\"65535\",\"farm\":66,\"title\":\"SULTHON KEBAB | Call\\/WA : 0852 8034 2504 | Produsen Tortilla Kabupaten Landak\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532451701\",\"owner\":\"186686453@N05\",\"secret\":\"eef419fc3f\",\"server\":\"65535\",\"farm\":66,\"title\":\"SULTHON KEBAB | Call\\/WA : 0852 8034 2504 | Produsen Tortilla Kabupaten Lampung Utara\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532675927\",\"owner\":\"186686453@N05\",\"secret\":\"5ac1389a78\",\"server\":\"65535\",\"farm\":66,\"title\":\"SULTHON KEBAB | Call\\/WA : 0852 8034 2504 | Produsen Tortilla Kabupaten Lampung Timur\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532451586\",\"owner\":\"186686453@N05\",\"secret\":\"fab1d83411\",\"server\":\"65535\",\"farm\":66,\"title\":\"SULTHON KEBAB | Call\\/WA : 0852 8034 2504 | Produsen Tortilla Kabupaten Lampung Tengah\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532675792\",\"owner\":\"186686453@N05\",\"secret\":\"0a5648afab\",\"server\":\"65535\",\"farm\":66,\"title\":\"SULTHON KEBAB | Call\\/WA : 0852 8034 2504 | Produsen Tortilla Kabupaten Lampung Selatan\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532451511\",\"owner\":\"186686453@N05\",\"secret\":\"31ac1a168d\",\"server\":\"65535\",\"farm\":66,\"title\":\"SULTHON KEBAB | Call\\/WA : 0852 8034 2504 | Produsen Tortilla Kabupaten Lampung Barat\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49531950463\",\"owner\":\"186686453@N05\",\"secret\":\"74053ca59c\",\"server\":\"65535\",\"farm\":66,\"title\":\"SULTHON KEBAB | Call\\/WA : 0852 8034 2504 | Produsen Tortilla Kabupaten Lamongan\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49531950398\",\"owner\":\"186686453@N05\",\"secret\":\"8b3765fef6\",\"server\":\"65535\",\"farm\":66,\"title\":\"SULTHON KEBAB | Call\\/WA : 0852 8034 2504 | Produsen Tortilla Kabupaten Lamandau\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49531952063\",\"owner\":\"186692685@N04\",\"secret\":\"19f65a1391\",\"server\":\"65535\",\"farm\":66,\"title\":\"TAMMA FOOD | Call\\/WA : 0812 3456 4482 | Produsen Tortilla Kabupaten Klaten\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532453011\",\"owner\":\"186692685@N04\",\"secret\":\"5de7451b91\",\"server\":\"65535\",\"farm\":66,\"title\":\"TAMMA FOOD | Call\\/WA : 0812 3456 4482 | Produsen Tortilla Kabupaten Ketapang\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532436841\",\"owner\":\"186692685@N04\",\"secret\":\"b653da44b3\",\"server\":\"65535\",\"farm\":66,\"title\":\"TAMMA FOOD | Call\\/WA : 0812 3456 4482 | Produsen Tortilla Kabupaten Kerinci\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532661417\",\"owner\":\"186692685@N04\",\"secret\":\"912cf808c7\",\"server\":\"65535\",\"farm\":66,\"title\":\"TAMMA FOOD | Call\\/WA : 0812 3456 4482 | Produsen Tortilla Kabupaten Kepulauan Yapen\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532436806\",\"owner\":\"186692685@N04\",\"secret\":\"c3d245f8cf\",\"server\":\"65535\",\"farm\":66,\"title\":\"TAMMA FOOD | Call\\/WA : 0812 3456 4482 | Produsen Tortilla Kabupaten Kepulauan Talaud\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532661382\",\"owner\":\"186692685@N04\",\"secret\":\"2e655e9689\",\"server\":\"65535\",\"farm\":66,\"title\":\"TAMMA FOOD | Call\\/WA : 0812 3456 4482 | Produsen Tortilla Kabupaten Kepulauan Sula\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532661367\",\"owner\":\"186692685@N04\",\"secret\":\"63612bef74\",\"server\":\"65535\",\"farm\":66,\"title\":\"TAMMA FOOD | Call\\/WA : 0812 3456 4482 | Produsen Tortilla Kabupaten Kepulauan Siau Tagulandang Biaro\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532436701\",\"owner\":\"186692685@N04\",\"secret\":\"d653583558\",\"server\":\"65535\",\"farm\":66,\"title\":\"TAMMA FOOD | Call\\/WA : 0812 3456 4482 | Produsen Tortilla Kabupaten Administrasi Kepulauan Seribu\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49531935778\",\"owner\":\"186692685@N04\",\"secret\":\"d2d1667661\",\"server\":\"65535\",\"farm\":66,\"title\":\"TAMMA FOOD | Call\\/WA : 0812 3456 4482 | Produsen Tortilla Kabupaten Kepulauan Selayar\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532436601\",\"owner\":\"186692685@N04\",\"secret\":\"3f39064a29\",\"server\":\"65535\",\"farm\":66,\"title\":\"TAMMA FOOD | Call\\/WA : 0812 3456 4482 | Produsen Tortilla Kabupaten Kepulauan Sangihe\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49531935728\",\"owner\":\"186692685@N04\",\"secret\":\"4eafc0f41f\",\"server\":\"65535\",\"farm\":66,\"title\":\"TAMMA FOOD | Call\\/WA : 0812 3456 4482 | Produsen Tortilla Kabupaten Kepulauan Meranti\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532436571\",\"owner\":\"186692685@N04\",\"secret\":\"77e2d1b251\",\"server\":\"65535\",\"farm\":66,\"title\":\"TAMMA FOOD | Call\\/WA : 0812 3456 4482 | Produsen Tortilla Kabupaten Kepulauan Mentawai\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532436561\",\"owner\":\"186692685@N04\",\"secret\":\"4fc1b5da77\",\"server\":\"65535\",\"farm\":66,\"title\":\"TAMMA FOOD | Call\\/WA : 0812 3456 4482 | Produsen Tortilla Kabupaten Kepulauan Aru\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49531935688\",\"owner\":\"186692685@N04\",\"secret\":\"dc745aabde\",\"server\":\"65535\",\"farm\":66,\"title\":\"TAMMA FOOD | Call\\/WA : 0812 3456 4482 | Produsen Tortilla Kabupaten Kepulauan Anambas\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532661147\",\"owner\":\"186692685@N04\",\"secret\":\"145f102e1f\",\"server\":\"65535\",\"farm\":66,\"title\":\"TAMMA FOOD | Call\\/WA : 0812 3456 4482 | Produsen Tortilla Kabupaten Kepahiang\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532661117\",\"owner\":\"186692685@N04\",\"secret\":\"7318fc41b8\",\"server\":\"65535\",\"farm\":66,\"title\":\"TAMMA FOOD | Call\\/WA : 0812 3456 4482 | Produsen Tortilla Kabupaten Kendal\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532661062\",\"owner\":\"186692685@N04\",\"secret\":\"d2b1ecaa10\",\"server\":\"65535\",\"farm\":66,\"title\":\"TAMMA FOOD | Call\\/WA : 0812 3456 4482 | Produsen Tortilla Kabupaten Keerom\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49531935518\",\"owner\":\"186692685@N04\",\"secret\":\"740066886f\",\"server\":\"65535\",\"farm\":66,\"title\":\"TAMMA FOOD | Call\\/WA : 0812 3456 4482 | Produsen Tortilla Kabupaten Kediri\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532436321\",\"owner\":\"186692685@N04\",\"secret\":\"7639ebf97a\",\"server\":\"65535\",\"farm\":66,\"title\":\"TAMMA FOOD | Call\\/WA : 0812 3456 4482 | Produsen Tortilla Kabupaten Kebumen\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49531935463\",\"owner\":\"186692685@N04\",\"secret\":\"3e92841bf7\",\"server\":\"65535\",\"farm\":66,\"title\":\"TAMMA FOOD | Call\\/WA : 0812 3456 4482 | Produsen Tortilla Kabupaten Kayong Utara\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532432526\",\"owner\":\"18828092@N02\",\"secret\":\"fbc5bb7e98\",\"server\":\"65535\",\"farm\":66,\"title\":\"Andy Cuadra Day 44 2020 366\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532330741\",\"owner\":\"22508531@N08\",\"secret\":\"604e72615c\",\"server\":\"65535\",\"farm\":66,\"title\":\"Cauliflower Crust Pizza\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532543777\",\"owner\":\"185908376@N03\",\"secret\":\"dce1caf712\",\"server\":\"65535\",\"farm\":66,\"title\":\"3-pizza - Copy\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532244426\",\"owner\":\"51035827022@N01\",\"secret\":\"53ca212404\",\"server\":\"65535\",\"farm\":66,\"title\":\"Pizza Partyin\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532468677\",\"owner\":\"51035827022@N01\",\"secret\":\"04b5c3c90a\",\"server\":\"65535\",\"farm\":66,\"title\":\"Casey's Pizza Party\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532241521\",\"owner\":\"51035827022@N01\",\"secret\":\"4efaa24e9e\",\"server\":\"65535\",\"farm\":66,\"title\":\"Fong's!\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532452602\",\"owner\":\"31385398@N07\",\"secret\":\"ae89500839\",\"server\":\"65535\",\"farm\":66,\"title\":\"G's Pizza\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49531724908\",\"owner\":\"31385398@N07\",\"secret\":\"61d572317d\",\"server\":\"65535\",\"farm\":66,\"title\":\"G's Pizza\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532446857\",\"owner\":\"31385398@N07\",\"secret\":\"23e65e3c89\",\"server\":\"65535\",\"farm\":66,\"title\":\"G's Pizza\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532222501\",\"owner\":\"31385398@N07\",\"secret\":\"2326fa28be\",\"server\":\"65535\",\"farm\":66,\"title\":\"G's Pizza\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532222436\",\"owner\":\"31385398@N07\",\"secret\":\"34962eb3a4\",\"server\":\"65535\",\"farm\":66,\"title\":\"G's Pizza\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532438467\",\"owner\":\"31385398@N07\",\"secret\":\"3e335c3a45\",\"server\":\"65535\",\"farm\":66,\"title\":\"G's Pizza\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532112591\",\"owner\":\"55294237@N02\",\"secret\":\"488b620c83\",\"server\":\"65535\",\"farm\":66,\"title\":\"MCW_Top Chef Pizza Day_IMG_3184\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49531607918\",\"owner\":\"55294237@N02\",\"secret\":\"9b9aff2074\",\"server\":\"65535\",\"farm\":66,\"title\":\"MCW_Top Chef Pizza Day_IMG_3183\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532112571\",\"owner\":\"55294237@N02\",\"secret\":\"404cef5c3b\",\"server\":\"65535\",\"farm\":66,\"title\":\"MCW_Top Chef Pizza Day_IMG_3185\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532334882\",\"owner\":\"55294237@N02\",\"secret\":\"80a97c07bc\",\"server\":\"65535\",\"farm\":66,\"title\":\"MCW_Top Chef Pizza Day_IMG_3186\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49531607843\",\"owner\":\"55294237@N02\",\"secret\":\"6137e82594\",\"server\":\"65535\",\"farm\":66,\"title\":\"MCW_Top Chef Pizza Day_IMG_3187\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532334807\",\"owner\":\"55294237@N02\",\"secret\":\"bef5533a30\",\"server\":\"65535\",\"farm\":66,\"title\":\"MCW_Top Chef Pizza Day_IMG_3189\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49531607813\",\"owner\":\"55294237@N02\",\"secret\":\"7eef81affa\",\"server\":\"65535\",\"farm\":66,\"title\":\"MCW_Top Chef Pizza Day_IMG_3188\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532314742\",\"owner\":\"28333262@N00\",\"secret\":\"ce138606ee\",\"server\":\"65535\",\"farm\":66,\"title\":\"Samurai Pizza Cats!\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532314622\",\"owner\":\"28333262@N00\",\"secret\":\"df14185d89\",\"server\":\"65535\",\"farm\":66,\"title\":\"Samurai Pizza Cats!\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532091956\",\"owner\":\"28333262@N00\",\"secret\":\"bae976b1cb\",\"server\":\"65535\",\"farm\":66,\"title\":\"Samurai Pizza Cats!\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49531587423\",\"owner\":\"28333262@N00\",\"secret\":\"038dd207b8\",\"server\":\"65535\",\"farm\":66,\"title\":\"Samurai Pizza Cats!\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532091216\",\"owner\":\"28333262@N00\",\"secret\":\"fc1d27d35c\",\"server\":\"65535\",\"farm\":66,\"title\":\"Samurai Pizza Cats!\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49531586818\",\"owner\":\"28333262@N00\",\"secret\":\"f8bcd84cc5\",\"server\":\"65535\",\"farm\":66,\"title\":\"Samurai Pizza Cats!\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532091051\",\"owner\":\"28333262@N00\",\"secret\":\"00f2c3bc42\",\"server\":\"65535\",\"farm\":66,\"title\":\"Samurai Pizza Cats!\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532313247\",\"owner\":\"28333262@N00\",\"secret\":\"15faf7dccf\",\"server\":\"65535\",\"farm\":66,\"title\":\"Samurai Pizza Cats!\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49531586193\",\"owner\":\"28333262@N00\",\"secret\":\"0cf5fc7932\",\"server\":\"65535\",\"farm\":66,\"title\":\"Samurai Pizza Cats!\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532313022\",\"owner\":\"28333262@N00\",\"secret\":\"0903a37533\",\"server\":\"65535\",\"farm\":66,\"title\":\"Samurai Pizza Cats!\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532090261\",\"owner\":\"28333262@N00\",\"secret\":\"4dddee4a81\",\"server\":\"65535\",\"farm\":66,\"title\":\"Samurai Pizza Cats!\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532089616\",\"owner\":\"28333262@N00\",\"secret\":\"277fa2c82c\",\"server\":\"65535\",\"farm\":66,\"title\":\"Samurai Pizza Cats!\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49531584848\",\"owner\":\"28333262@N00\",\"secret\":\"f9fe669e09\",\"server\":\"65535\",\"farm\":66,\"title\":\"Samurai Pizza Cats!\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49531584493\",\"owner\":\"28333262@N00\",\"secret\":\"8b0e686e6e\",\"server\":\"65535\",\"farm\":66,\"title\":\"Samurai Pizza Cats!\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49531583668\",\"owner\":\"28333262@N00\",\"secret\":\"8b904e5dd6\",\"server\":\"65535\",\"farm\":66,\"title\":\"Samurai Pizza Cats!\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532310692\",\"owner\":\"28333262@N00\",\"secret\":\"46d10560b0\",\"server\":\"65535\",\"farm\":66,\"title\":\"Samurai Pizza Cats!\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49531582843\",\"owner\":\"28333262@N00\",\"secret\":\"9bf95dba70\",\"server\":\"65535\",\"farm\":66,\"title\":\"Samurai Pizza Cats!\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532309772\",\"owner\":\"28333262@N00\",\"secret\":\"5649ff0a14\",\"server\":\"65535\",\"farm\":66,\"title\":\"Samurai Pizza Cats!\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49531581953\",\"owner\":\"28333262@N00\",\"secret\":\"96cf267295\",\"server\":\"65535\",\"farm\":66,\"title\":\"Samurai Pizza Cats!\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532085796\",\"owner\":\"28333262@N00\",\"secret\":\"4203fc69e9\",\"server\":\"65535\",\"farm\":66,\"title\":\"Samurai Pizza Cats!\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532085446\",\"owner\":\"28333262@N00\",\"secret\":\"7a96b32dda\",\"server\":\"65535\",\"farm\":66,\"title\":\"Samurai Pizza Cats!\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49531580358\",\"owner\":\"28333262@N00\",\"secret\":\"d92363daba\",\"server\":\"65535\",\"farm\":66,\"title\":\"Samurai Pizza Cats!\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532307017\",\"owner\":\"28333262@N00\",\"secret\":\"88f24e1741\",\"server\":\"65535\",\"farm\":66,\"title\":\"Samurai Pizza Cats!\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532083656\",\"owner\":\"28333262@N00\",\"secret\":\"74c48cc410\",\"server\":\"65535\",\"farm\":66,\"title\":\"Samurai Pizza Cats!\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532083316\",\"owner\":\"28333262@N00\",\"secret\":\"3af16b5856\",\"server\":\"65535\",\"farm\":66,\"title\":\"Samurai Pizza Cats!\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532083161\",\"owner\":\"28333262@N00\",\"secret\":\"fbaedcb492\",\"server\":\"65535\",\"farm\":66,\"title\":\"Samurai Pizza Cats!\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49531577978\",\"owner\":\"28333262@N00\",\"secret\":\"9109ec2166\",\"server\":\"65535\",\"farm\":66,\"title\":\"Samurai Pizza Cats!\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532082211\",\"owner\":\"28333262@N00\",\"secret\":\"95439df9f9\",\"server\":\"65535\",\"farm\":66,\"title\":\"Samurai Pizza Cats!\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532081476\",\"owner\":\"28333262@N00\",\"secret\":\"01b9c96145\",\"server\":\"65535\",\"farm\":66,\"title\":\"Samurai Pizza Cats!\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49532081406\",\"owner\":\"28333262@N00\",\"secret\":\"ebb62af7a7\",\"server\":\"65535\",\"farm\":66,\"title\":\"Samurai Pizza Cats!\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0},{\"id\":\"49531576193\",\"owner\":\"28333262@N00\",\"secret\":\"5a3e55fda0\",\"server\":\"65535\",\"farm\":66,\"title\":\"Samurai Pizza Cats!\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0}]},\"stat\":\"ok\"}";

        Gson gson = new Gson();


        PhotosResponse response = gson.fromJson(json, PhotosResponse.class);


        assertTrue(response != null);

    }


    @Test
    public void constructThumbnailUrl() {

        String url = "https://farm66.staticflickr.com/65535/49532265273_d04e9c7c6c.jpg";

        // "{ \"id\": \"49532265273\", \"owner\": \"186686453@N05\", \"secret\": \"d04e9c7c6c\", \"server\": \"65535\", \"farm\": 66, \"title\": \"SULTHON KEBAB | Call\\/WA : 0852 8034 2504 | Produsen Tortilla Kabupaten Malinau\", \"ispublic\": 1, \"isfriend\": 0, \"isfamily\": 0 },";

//        String constructedUrl = String.format(Constants.IMAGE_CONSTRUCT_THUMB, "66", "65535", "49532265273", "d04e9c7c6c");

        String constructedUrl = String.format(Constants.IMAGE_CONSTRUCT_THUMB, "66", "655d35", "49532265273", "d04e9c7c6c");


        assertEquals(constructedUrl, url);

    }

    @Test
    public void constructBigImageUrl() {

        String url = "https://farm66.staticflickr.com/65535/49532265273_d04e9c7c6c_b.jpg";

        // "{ \"id\": \"49532265273\", \"owner\": \"186686453@N05\", \"secret\": \"d04e9c7c6c\", \"server\": \"65535\", \"farm\": 66, \"title\": \"SULTHON KEBAB | Call\\/WA : 0852 8034 2504 | Produsen Tortilla Kabupaten Malinau\", \"ispublic\": 1, \"isfriend\": 0, \"isfamily\": 0 },";

        String constructedUrl = String.format(Constants.IMAGE_CONSTRUCT_BIG, "66", "65535", "49532265273", "d04e9c7c6c", "b");

        assertEquals(constructedUrl, url);

    }

    private static File getFileFromPath(Object obj, String fileName) {
        ClassLoader classLoader = obj.getClass().getClassLoader();
        URL resource = classLoader.getResource(fileName);
        return new File(resource.getPath());
    }
}