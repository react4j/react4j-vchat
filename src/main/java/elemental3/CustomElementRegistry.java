package elemental3;

import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CustomElementRegistry"
)
public class CustomElementRegistry {
  CustomElementRegistry() {
  }

  public native void define(@Nonnull String name, @Nonnull CustomElementConstructor constructor,
      @Nonnull ElementDefinitionOptions options);

  public native void define(@Nonnull String name, @Nonnull CustomElementConstructor constructor);

  @Nullable
  public native Any get(@Nonnull String name);

  public native void upgrade(@Nonnull Node root);

  @Nonnull
  public native Promise<Void> whenDefined(@Nonnull String name);
}
