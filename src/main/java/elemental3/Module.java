package elemental3;

import elemental2.core.ArrayBuffer;
import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "WebAssembly.Module"
)
public class Module {
  Module() {
  }

  @Nonnull
  public static native JsArray<ArrayBuffer> customSections(@Nonnull Module moduleObject,
      @Nonnull String sectionName);

  @Nonnull
  public static native JsArray<ModuleExportDescriptor> exports(@Nonnull Module moduleObject);

  @Nonnull
  public static native JsArray<ModuleImportDescriptor> imports(@Nonnull Module moduleObject);
}
