package elemental3;

import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

/**
 * The CustomElementRegistry interface provides methods for registering custom elements and querying registered elements. To get an instance of it, use the window.customElements property.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CustomElementRegistry">CustomElementRegistry - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CustomElementRegistry"
)
public class CustomElementRegistry {
  CustomElementRegistry() {
  }

  /**
   * The define() method of the CustomElementRegistry interface defines a new custom element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CustomElementRegistry/define">CustomElementRegistry.define - MDN</a>
   */
  public native void define(@Nonnull String name, @Nonnull CustomElementConstructor constructor,
      @Nonnull ElementDefinitionOptions options);

  /**
   * The define() method of the CustomElementRegistry interface defines a new custom element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CustomElementRegistry/define">CustomElementRegistry.define - MDN</a>
   */
  public native void define(@Nonnull String name, @Nonnull CustomElementConstructor constructor);

  /**
   * The get() method of the CustomElementRegistry interface returns the constructor for a previously-defined custom element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CustomElementRegistry/get">CustomElementRegistry.get - MDN</a>
   */
  @Nullable
  public native Any get(@Nonnull String name);

  /**
   * The upgrade() method of the CustomElementRegistry interface upgrades all shadow-containing custom elements in a Node subtree, even before they are connected to the main document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CustomElementRegistry/upgrade">CustomElementRegistry.upgrade - MDN</a>
   */
  public native void upgrade(@Nonnull Node root);

  /**
   * The whenDefined() method of the CustomElementRegistry interface returns a Promise that resolves when the named element is defined.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CustomElementRegistry/whenDefined">CustomElementRegistry.whenDefined - MDN</a>
   */
  @Nonnull
  public native Promise<Void> whenDefined(@Nonnull String name);
}
