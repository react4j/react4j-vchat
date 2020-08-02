package elemental3;

import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface MutationObserverInit {
  @JsOverlay
  @Nonnull
  static MutationObserverInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "attributeFilter"
  )
  JsArray<String> attributeFilter();

  @JsProperty
  void setAttributeFilter(@Nonnull JsArray<String> attributeFilter);

  @JsOverlay
  @Nonnull
  default MutationObserverInit attributeFilter(@Nonnull final JsArray<String> attributeFilter) {
    setAttributeFilter( attributeFilter );
    return this;
  }

  @JsOverlay
  default void setAttributeFilter(@Nonnull final String... attributeFilter) {
    setAttributeFilter( JsArray.asJsArray( attributeFilter ) );
  }

  @JsOverlay
  @Nonnull
  default MutationObserverInit attributeFilter(@Nonnull final String... attributeFilter) {
    setAttributeFilter( attributeFilter );
    return this;
  }

  @JsProperty(
      name = "attributeOldValue"
  )
  boolean attributeOldValue();

  @JsProperty
  void setAttributeOldValue(boolean attributeOldValue);

  @JsOverlay
  @Nonnull
  default MutationObserverInit attributeOldValue(final boolean attributeOldValue) {
    setAttributeOldValue( attributeOldValue );
    return this;
  }

  @JsProperty(
      name = "attributes"
  )
  boolean attributes();

  @JsProperty
  void setAttributes(boolean attributes);

  @JsOverlay
  @Nonnull
  default MutationObserverInit attributes(final boolean attributes) {
    setAttributes( attributes );
    return this;
  }

  @JsProperty(
      name = "characterData"
  )
  boolean characterData();

  @JsProperty
  void setCharacterData(boolean characterData);

  @JsOverlay
  @Nonnull
  default MutationObserverInit characterData(final boolean characterData) {
    setCharacterData( characterData );
    return this;
  }

  @JsProperty(
      name = "characterDataOldValue"
  )
  boolean characterDataOldValue();

  @JsProperty
  void setCharacterDataOldValue(boolean characterDataOldValue);

  @JsOverlay
  @Nonnull
  default MutationObserverInit characterDataOldValue(final boolean characterDataOldValue) {
    setCharacterDataOldValue( characterDataOldValue );
    return this;
  }

  @JsProperty(
      name = "childList"
  )
  boolean childList();

  @JsProperty
  void setChildList(boolean childList);

  @JsOverlay
  @Nonnull
  default MutationObserverInit childList(final boolean childList) {
    setChildList( childList );
    return this;
  }

  @JsProperty(
      name = "subtree"
  )
  boolean subtree();

  @JsProperty
  void setSubtree(boolean subtree);

  @JsOverlay
  @Nonnull
  default MutationObserverInit subtree(final boolean subtree) {
    setSubtree( subtree );
    return this;
  }
}
