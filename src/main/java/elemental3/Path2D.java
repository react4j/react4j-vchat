package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Path2D"
)
public class Path2D {
  public Path2D(@Nonnull final Path2D path) {
  }

  public Path2D(@Nonnull final String path) {
  }

  public Path2D() {
  }

  public native void addPath(@Nonnull Path2D path, @Nonnull DOMMatrix2DInit transform);

  public native void addPath(@Nonnull Path2D path);

  public native void arc(double x, double y, double radius, double startAngle, double endAngle,
      boolean anticlockwise);

  public native void arc(double x, double y, double radius, double startAngle, double endAngle);

  public native void arcTo(double x1, double y1, double x2, double y2, double radius);

  public native void bezierCurveTo(double cp1x, double cp1y, double cp2x, double cp2y, double x,
      double y);

  public native void closePath();

  public native void ellipse(double x, double y, double radiusX, double radiusY, double rotation,
      double startAngle, double endAngle, boolean anticlockwise);

  public native void ellipse(double x, double y, double radiusX, double radiusY, double rotation,
      double startAngle, double endAngle);

  public native void lineTo(double x, double y);

  public native void moveTo(double x, double y);

  public native void quadraticCurveTo(double cpx, double cpy, double x, double y);

  public native void rect(double x, double y, double w, double h);
}
