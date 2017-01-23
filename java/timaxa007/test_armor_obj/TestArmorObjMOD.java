package timaxa007.test_armor_obj;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = TestArmorObjMOD.MODID, name = TestArmorObjMOD.NAME, version = TestArmorObjMOD.VERSION)
public class TestArmorObjMOD {

	public static final String
	MODID = "test_armor_obj",
	NAME = "Test Armor Obj",
	VERSION = "0.001";

	@Mod.Instance(MODID) public static TestArmorObjMOD instance;

	public static Item
	itemArmorTestObjHelm,
	itemArmorTestObjVest,
	itemArmorTestObjPants,
	itemArmorTestObjBoots
	;

	@Mod.EventHandler
	public void preInit(cpw.mods.fml.common.event.FMLPreInitializationEvent event) {
		itemArmorTestObjHelm = new ItemArmorTestObj(ArmorMaterial.IRON, 0)
		.setUnlocalizedName("armor_test_obj_helm").setCreativeTab(CreativeTabs.tabCombat);
		GameRegistry.registerItem(itemArmorTestObjHelm, "item_armor_test_obj_helm");

		itemArmorTestObjVest = new ItemArmorTestObj(ArmorMaterial.IRON, 1)
		.setUnlocalizedName("armor_test_obj_vest").setCreativeTab(CreativeTabs.tabCombat);
		GameRegistry.registerItem(itemArmorTestObjVest, "item_armor_test_obj_vest");

		itemArmorTestObjPants = new ItemArmorTestObj(ArmorMaterial.IRON, 2)
		.setUnlocalizedName("armor_test_obj_pants").setCreativeTab(CreativeTabs.tabCombat);
		GameRegistry.registerItem(itemArmorTestObjPants, "item_armor_test_obj_pants");

		itemArmorTestObjBoots = new ItemArmorTestObj(ArmorMaterial.IRON, 3)
		.setUnlocalizedName("armor_test_obj_boots").setCreativeTab(CreativeTabs.tabCombat);
		GameRegistry.registerItem(itemArmorTestObjBoots, "item_armor_test_obj_boots");
	}

}
