package defpackage;

import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class zp7 {
    public static final nq7[] b;
    public static final nq7[][] c;
    public static final HashSet d;
    public static final String e;
    public final ArrayList a;

    static {
        nq7[] nq7VarArr = {new nq7("ImageWidth", 256, 3, 4), new nq7("ImageLength", 257, 3, 4), new nq7("Make", 271, 2), new nq7("Model", 272, 2), new nq7("Orientation", 274, 3), new nq7("XResolution", 282, 5), new nq7("YResolution", 283, 5), new nq7("ResolutionUnit", 296, 3), new nq7("Software", 305, 2), new nq7("DateTime", 306, 2), new nq7("YCbCrPositioning", 531, 3), new nq7("SubIFDPointer", 330, 4), new nq7("ExifIFDPointer", 34665, 4), new nq7("GPSInfoIFDPointer", 34853, 4)};
        nq7[] nq7VarArr2 = {new nq7("ExposureTime", 33434, 5), new nq7("FNumber", 33437, 5), new nq7("ExposureProgram", 34850, 3), new nq7("PhotographicSensitivity", 34855, 3), new nq7("SensitivityType", 34864, 3), new nq7("ExifVersion", 36864, 2), new nq7("DateTimeOriginal", 36867, 2), new nq7("DateTimeDigitized", 36868, 2), new nq7("ComponentsConfiguration", 37121, 7), new nq7("ShutterSpeedValue", 37377, 10), new nq7("ApertureValue", 37378, 5), new nq7("BrightnessValue", 37379, 10), new nq7("ExposureBiasValue", 37380, 10), new nq7("MaxApertureValue", 37381, 5), new nq7("MeteringMode", 37383, 3), new nq7("LightSource", 37384, 3), new nq7("Flash", 37385, 3), new nq7("FocalLength", 37386, 5), new nq7("SubSecTime", 37520, 2), new nq7("SubSecTimeOriginal", 37521, 2), new nq7("SubSecTimeDigitized", 37522, 2), new nq7("FlashpixVersion", 40960, 7), new nq7("ColorSpace", 40961, 3), new nq7("PixelXDimension", 40962, 3, 4), new nq7("PixelYDimension", 40963, 3, 4), new nq7("InteroperabilityIFDPointer", 40965, 4), new nq7("FocalPlaneResolutionUnit", 41488, 3), new nq7("SensingMethod", 41495, 3), new nq7("FileSource", 41728, 7), new nq7("SceneType", 41729, 7), new nq7("CustomRendered", 41985, 3), new nq7("ExposureMode", 41986, 3), new nq7("WhiteBalance", 41987, 3), new nq7("SceneCaptureType", 41990, 3), new nq7("Contrast", 41992, 3), new nq7("Saturation", 41993, 3), new nq7("Sharpness", 41994, 3)};
        nq7[] nq7VarArr3 = {new nq7("GPSVersionID", 0, 1), new nq7("GPSLatitudeRef", 1, 2), new nq7("GPSLatitude", 2, 5, 10), new nq7("GPSLongitudeRef", 3, 2), new nq7("GPSLongitude", 4, 5, 10), new nq7("GPSAltitudeRef", 5, 1), new nq7("GPSAltitude", 6, 5), new nq7("GPSTimeStamp", 7, 5), new nq7("GPSSpeedRef", 12, 2), new nq7("GPSTrackRef", 14, 2), new nq7("GPSImgDirectionRef", 16, 2), new nq7("GPSDestBearingRef", 23, 2), new nq7("GPSDestDistanceRef", 25, 2)};
        b = new nq7[]{new nq7("SubIFDPointer", 330, 4), new nq7("ExifIFDPointer", 34665, 4), new nq7("GPSInfoIFDPointer", 34853, 4), new nq7("InteroperabilityIFDPointer", 40965, 4)};
        c = new nq7[][]{nq7VarArr, nq7VarArr2, nq7VarArr3, new nq7[]{new nq7("InteroperabilityIndex", 1, 2)}};
        d = new HashSet(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
        e = new String(new byte[]{1, 2, 3, 0}, StandardCharsets.UTF_8);
    }

    public zp7(ArrayList arrayList) {
        boolean z;
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        if (arrayList.size() == 4) {
            z = true;
        } else {
            z = false;
        }
        grn.g("Malformed attributes list. Number of IFDs mismatch.", z);
        this.a = arrayList;
    }

    public final Map a(int i) {
        grn.d(sv6.j(i, "Invalid IFD index: ", ". Index should be between [0, EXIF_TAGS.length] "), i, 0, 4);
        return (Map) this.a.get(i);
    }
}
