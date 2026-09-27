package defpackage;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.socure.docv.capturesdk.common.utils.BlurConstants;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import io.ably.lib.util.AgentHeaderCreator;
import io.sentry.android.core.m0;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class gq7 {
    public static final String[] G;
    public static final int[] H;
    public static final byte[] I;
    public static final dq7 J;
    public static final dq7[][] K;
    public static final dq7[] L;
    public static final HashMap[] M;
    public static final HashMap[] N;
    public static final Set O;
    public static final HashMap P;
    public static final Charset Q;
    public static final byte[] R;
    public static final byte[] S;
    public final String a;
    public final FileDescriptor b;
    public final AssetManager.AssetInputStream c;
    public int d;
    public final boolean e;
    public final HashMap[] f;
    public final HashSet g;
    public ByteOrder h;
    public boolean i;
    public int j;
    public int k;
    public int l;
    public int m;
    public cq7 n;
    public static final boolean o = Log.isLoggable("ExifInterface", 3);
    public static final List p = Arrays.asList(1, 6, 3, 8);
    public static final List q = Arrays.asList(2, 7, 4, 5);
    public static final int[] r = {8, 8, 8};
    public static final int[] s = {8};
    public static final byte[] t = {-1, MessagePack.Code.FIXEXT16, -1};
    public static final byte[] u = {102, 116, 121, 112};
    public static final byte[] v = {109, 105, 102, 49};
    public static final byte[] w = {104, 101, 105, 99};
    public static final byte[] x = {97, 118, 105, 102};
    public static final byte[] y = {97, 118, 105, 115};
    public static final byte[] z = {79, 76, 89, 77, 80, 0};
    public static final byte[] A = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] B = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] C = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
    public static final byte[] D = {82, 73, 70, 70};
    public static final byte[] E = {87, 69, 66, 80};
    public static final byte[] F = {69, 88, 73, 70};

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        G = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        H = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        I = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        dq7[] dq7VarArr = {new dq7("NewSubfileType", 254, 4), new dq7("SubfileType", 255, 4), new dq7("ImageWidth", 256, 3, 4), new dq7("ImageLength", 257, 3, 4), new dq7("BitsPerSample", 258, 3), new dq7("Compression", 259, 3), new dq7("PhotometricInterpretation", 262, 3), new dq7("ImageDescription", 270, 2), new dq7("Make", 271, 2), new dq7("Model", 272, 2), new dq7("StripOffsets", 273, 3, 4), new dq7("Orientation", 274, 3), new dq7("SamplesPerPixel", 277, 3), new dq7("RowsPerStrip", 278, 3, 4), new dq7("StripByteCounts", 279, 3, 4), new dq7("XResolution", 282, 5), new dq7("YResolution", 283, 5), new dq7("PlanarConfiguration", 284, 3), new dq7("ResolutionUnit", 296, 3), new dq7("TransferFunction", MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE, 3), new dq7("Software", 305, 2), new dq7("DateTime", 306, 2), new dq7("Artist", 315, 2), new dq7("WhitePoint", 318, 5), new dq7("PrimaryChromaticities", 319, 5), new dq7("SubIFDPointer", 330, 4), new dq7("JPEGInterchangeFormat", 513, 4), new dq7("JPEGInterchangeFormatLength", 514, 4), new dq7("YCbCrCoefficients", 529, 5), new dq7("YCbCrSubSampling", 530, 3), new dq7("YCbCrPositioning", 531, 3), new dq7("ReferenceBlackWhite", 532, 5), new dq7("Copyright", 33432, 2), new dq7("ExifIFDPointer", 34665, 4), new dq7("GPSInfoIFDPointer", 34853, 4), new dq7("SensorTopBorder", 4, 4), new dq7("SensorLeftBorder", 5, 4), new dq7("SensorBottomBorder", 6, 4), new dq7("SensorRightBorder", 7, 4), new dq7("ISO", 23, 3), new dq7("JpgFromRaw", 46, 7), new dq7("Xmp", 700, 1)};
        dq7[] dq7VarArr2 = {new dq7("ExposureTime", 33434, 5), new dq7("FNumber", 33437, 5), new dq7("ExposureProgram", 34850, 3), new dq7("SpectralSensitivity", 34852, 2), new dq7("PhotographicSensitivity", 34855, 3), new dq7("OECF", 34856, 7), new dq7("SensitivityType", 34864, 3), new dq7("StandardOutputSensitivity", 34865, 4), new dq7("RecommendedExposureIndex", 34866, 4), new dq7("ISOSpeed", 34867, 4), new dq7("ISOSpeedLatitudeyyy", 34868, 4), new dq7("ISOSpeedLatitudezzz", 34869, 4), new dq7("ExifVersion", 36864, 2), new dq7("DateTimeOriginal", 36867, 2), new dq7("DateTimeDigitized", 36868, 2), new dq7("OffsetTime", 36880, 2), new dq7("OffsetTimeOriginal", 36881, 2), new dq7("OffsetTimeDigitized", 36882, 2), new dq7("ComponentsConfiguration", 37121, 7), new dq7("CompressedBitsPerPixel", 37122, 5), new dq7("ShutterSpeedValue", 37377, 10), new dq7("ApertureValue", 37378, 5), new dq7("BrightnessValue", 37379, 10), new dq7("ExposureBiasValue", 37380, 10), new dq7("MaxApertureValue", 37381, 5), new dq7("SubjectDistance", 37382, 5), new dq7("MeteringMode", 37383, 3), new dq7("LightSource", 37384, 3), new dq7("Flash", 37385, 3), new dq7("FocalLength", 37386, 5), new dq7("SubjectArea", 37396, 3), new dq7("MakerNote", 37500, 7), new dq7("UserComment", 37510, 7), new dq7("SubSecTime", 37520, 2), new dq7("SubSecTimeOriginal", 37521, 2), new dq7("SubSecTimeDigitized", 37522, 2), new dq7("FlashpixVersion", 40960, 7), new dq7("ColorSpace", 40961, 3), new dq7("PixelXDimension", 40962, 3, 4), new dq7("PixelYDimension", 40963, 3, 4), new dq7("RelatedSoundFile", 40964, 2), new dq7("InteroperabilityIFDPointer", 40965, 4), new dq7("FlashEnergy", 41483, 5), new dq7("SpatialFrequencyResponse", 41484, 7), new dq7("FocalPlaneXResolution", 41486, 5), new dq7("FocalPlaneYResolution", 41487, 5), new dq7("FocalPlaneResolutionUnit", 41488, 3), new dq7("SubjectLocation", 41492, 3), new dq7("ExposureIndex", 41493, 5), new dq7("SensingMethod", 41495, 3), new dq7("FileSource", 41728, 7), new dq7("SceneType", 41729, 7), new dq7("CFAPattern", 41730, 7), new dq7("CustomRendered", 41985, 3), new dq7("ExposureMode", 41986, 3), new dq7("WhiteBalance", 41987, 3), new dq7("DigitalZoomRatio", 41988, 5), new dq7("FocalLengthIn35mmFilm", 41989, 3), new dq7("SceneCaptureType", 41990, 3), new dq7("GainControl", 41991, 3), new dq7("Contrast", 41992, 3), new dq7("Saturation", 41993, 3), new dq7("Sharpness", 41994, 3), new dq7("DeviceSettingDescription", 41995, 7), new dq7("SubjectDistanceRange", 41996, 3), new dq7("ImageUniqueID", 42016, 2), new dq7("CameraOwnerName", 42032, 2), new dq7("BodySerialNumber", 42033, 2), new dq7("LensSpecification", 42034, 5), new dq7("LensMake", 42035, 2), new dq7("LensModel", 42036, 2), new dq7("Gamma", 42240, 5), new dq7("DNGVersion", 50706, 1), new dq7("DefaultCropSize", 50720, 3, 4)};
        dq7[] dq7VarArr3 = {new dq7("GPSVersionID", 0, 1), new dq7("GPSLatitudeRef", 1, 2), new dq7("GPSLatitude", 2, 5, 10), new dq7("GPSLongitudeRef", 3, 2), new dq7("GPSLongitude", 4, 5, 10), new dq7("GPSAltitudeRef", 5, 1), new dq7("GPSAltitude", 6, 5), new dq7("GPSTimeStamp", 7, 5), new dq7("GPSSatellites", 8, 2), new dq7("GPSStatus", 9, 2), new dq7("GPSMeasureMode", 10, 2), new dq7("GPSDOP", 11, 5), new dq7("GPSSpeedRef", 12, 2), new dq7("GPSSpeed", 13, 5), new dq7("GPSTrackRef", 14, 2), new dq7("GPSTrack", 15, 5), new dq7("GPSImgDirectionRef", 16, 2), new dq7("GPSImgDirection", 17, 5), new dq7("GPSMapDatum", 18, 2), new dq7("GPSDestLatitudeRef", 19, 2), new dq7("GPSDestLatitude", 20, 5), new dq7("GPSDestLongitudeRef", 21, 2), new dq7("GPSDestLongitude", 22, 5), new dq7("GPSDestBearingRef", 23, 2), new dq7("GPSDestBearing", 24, 5), new dq7("GPSDestDistanceRef", 25, 2), new dq7("GPSDestDistance", 26, 5), new dq7("GPSProcessingMethod", 27, 7), new dq7("GPSAreaInformation", 28, 7), new dq7("GPSDateStamp", 29, 2), new dq7("GPSDifferential", 30, 3), new dq7("GPSHPositioningError", 31, 5)};
        dq7[] dq7VarArr4 = {new dq7("InteroperabilityIndex", 1, 2)};
        dq7[] dq7VarArr5 = {new dq7("NewSubfileType", 254, 4), new dq7("SubfileType", 255, 4), new dq7("ThumbnailImageWidth", 256, 3, 4), new dq7("ThumbnailImageLength", 257, 3, 4), new dq7("BitsPerSample", 258, 3), new dq7("Compression", 259, 3), new dq7("PhotometricInterpretation", 262, 3), new dq7("ImageDescription", 270, 2), new dq7("Make", 271, 2), new dq7("Model", 272, 2), new dq7("StripOffsets", 273, 3, 4), new dq7("ThumbnailOrientation", 274, 3), new dq7("SamplesPerPixel", 277, 3), new dq7("RowsPerStrip", 278, 3, 4), new dq7("StripByteCounts", 279, 3, 4), new dq7("XResolution", 282, 5), new dq7("YResolution", 283, 5), new dq7("PlanarConfiguration", 284, 3), new dq7("ResolutionUnit", 296, 3), new dq7("TransferFunction", MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE, 3), new dq7("Software", 305, 2), new dq7("DateTime", 306, 2), new dq7("Artist", 315, 2), new dq7("WhitePoint", 318, 5), new dq7("PrimaryChromaticities", 319, 5), new dq7("SubIFDPointer", 330, 4), new dq7("JPEGInterchangeFormat", 513, 4), new dq7("JPEGInterchangeFormatLength", 514, 4), new dq7("YCbCrCoefficients", 529, 5), new dq7("YCbCrSubSampling", 530, 3), new dq7("YCbCrPositioning", 531, 3), new dq7("ReferenceBlackWhite", 532, 5), new dq7("Copyright", 33432, 2), new dq7("ExifIFDPointer", 34665, 4), new dq7("GPSInfoIFDPointer", 34853, 4), new dq7("DNGVersion", 50706, 1), new dq7("DefaultCropSize", 50720, 3, 4)};
        J = new dq7("StripOffsets", 273, 3);
        K = new dq7[][]{dq7VarArr, dq7VarArr2, dq7VarArr3, dq7VarArr4, dq7VarArr5, dq7VarArr, new dq7[]{new dq7("ThumbnailImage", 256, 7), new dq7("CameraSettingsIFDPointer", 8224, 4), new dq7("ImageProcessingIFDPointer", 8256, 4)}, new dq7[]{new dq7("PreviewImageStart", 257, 4), new dq7("PreviewImageLength", 258, 4)}, new dq7[]{new dq7("AspectFrame", 4371, 3)}, new dq7[]{new dq7("ColorSpace", 55, 3)}};
        L = new dq7[]{new dq7("SubIFDPointer", 330, 4), new dq7("ExifIFDPointer", 34665, 4), new dq7("GPSInfoIFDPointer", 34853, 4), new dq7("InteroperabilityIFDPointer", 40965, 4), new dq7("CameraSettingsIFDPointer", 8224, 1), new dq7("ImageProcessingIFDPointer", 8256, 1)};
        M = new HashMap[10];
        N = new HashMap[10];
        O = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        P = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        Q = forName;
        R = "Exif\u0000\u0000".getBytes(forName);
        S = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            dq7[][] dq7VarArr6 = K;
            if (i < dq7VarArr6.length) {
                M[i] = new HashMap();
                N[i] = new HashMap();
                for (dq7 dq7Var : dq7VarArr6[i]) {
                    M[i].put(Integer.valueOf(dq7Var.a), dq7Var);
                    N[i].put(dq7Var.b, dq7Var);
                }
                i++;
            } else {
                HashMap hashMap = P;
                dq7[] dq7VarArr7 = L;
                hashMap.put(Integer.valueOf(dq7VarArr7[0].a), 5);
                hashMap.put(Integer.valueOf(dq7VarArr7[1].a), 1);
                hashMap.put(Integer.valueOf(dq7VarArr7[2].a), 2);
                hashMap.put(Integer.valueOf(dq7VarArr7[3].a), 3);
                hashMap.put(Integer.valueOf(dq7VarArr7[4].a), 7);
                hashMap.put(Integer.valueOf(dq7VarArr7[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gq7(InputStream inputStream) {
        dq7[][] dq7VarArr = K;
        this.f = new HashMap[dq7VarArr.length];
        this.g = new HashSet(dq7VarArr.length);
        this.h = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.a = null;
            this.e = false;
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.c = (AssetManager.AssetInputStream) inputStream;
                this.b = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    try {
                        Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                        this.c = null;
                        this.b = fileInputStream.getFD();
                    } catch (Exception unused) {
                    }
                }
                this.c = null;
                this.b = null;
            }
            boolean z2 = this.e;
            boolean z3 = o;
            for (int i = 0; i < dq7VarArr.length; i++) {
                try {
                    try {
                        this.f[i] = new HashMap();
                    } catch (IOException | UnsupportedOperationException e) {
                        if (z3) {
                            m0.q("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                        }
                        a();
                        if (!z3) {
                            return;
                        }
                    }
                } catch (Throwable th) {
                    a();
                    if (z3) {
                        t();
                    }
                    throw th;
                }
            }
            if (!z2) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
                this.d = h(bufferedInputStream);
                inputStream = bufferedInputStream;
            }
            int i2 = this.d;
            if (i2 != 4 && i2 != 9 && i2 != 13 && i2 != 14) {
                fq7 fq7Var = new fq7(inputStream);
                if (z2) {
                    if (!o(fq7Var)) {
                        a();
                        if (!z3) {
                            return;
                        }
                        t();
                        return;
                    }
                } else {
                    int i3 = this.d;
                    if (i3 != 12 && i3 != 15) {
                        if (i3 == 7) {
                            i(fq7Var);
                        } else if (i3 == 10) {
                            n(fq7Var);
                        } else {
                            l(fq7Var);
                        }
                    }
                    f(fq7Var);
                }
                fq7Var.g(this.j);
                y(fq7Var);
                a();
                if (!z3) {
                    return;
                }
                t();
                return;
            }
            bq7 bq7Var = new bq7(inputStream);
            int i4 = this.d;
            if (i4 == 4) {
                g(bq7Var, 0, 0);
            } else if (i4 == 13) {
                j(bq7Var);
            } else if (i4 == 9) {
                k(bq7Var);
            } else if (i4 == 14) {
                p(bq7Var);
            }
            a();
            if (!z3) {
            }
            t();
            return;
        }
        dmk.s("inputStream cannot be null");
        throw null;
    }

    public static double b(String str, String str2) {
        try {
            String[] split = str.split(",", -1);
            String[] split2 = split[0].split(AgentHeaderCreator.AGENT_DIVIDER, -1);
            double parseDouble = Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim());
            String[] split3 = split[1].split(AgentHeaderCreator.AGENT_DIVIDER, -1);
            double parseDouble2 = Double.parseDouble(split3[0].trim()) / Double.parseDouble(split3[1].trim());
            String[] split4 = split[2].split(AgentHeaderCreator.AGENT_DIVIDER, -1);
            double parseDouble3 = ((Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim())) / 3600.0d) + (parseDouble2 / 60.0d) + parseDouble;
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return parseDouble3;
            }
            return -parseDouble3;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            xbc.s(e);
            return ConstantsKt.UNSET;
        }
    }

    public static ByteOrder u(bq7 bq7Var) {
        short readShort = bq7Var.readShort();
        if (readShort != 18761) {
            if (readShort == 19789) {
                return ByteOrder.BIG_ENDIAN;
            }
            dmk.m(Integer.toHexString(readShort), "Invalid byte order: ");
            return null;
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    public final void A(fq7 fq7Var, int i) {
        cq7 d;
        cq7 d2;
        HashMap[] hashMapArr = this.f;
        cq7 cq7Var = (cq7) hashMapArr[i].get("DefaultCropSize");
        cq7 cq7Var2 = (cq7) hashMapArr[i].get("SensorTopBorder");
        cq7 cq7Var3 = (cq7) hashMapArr[i].get("SensorLeftBorder");
        cq7 cq7Var4 = (cq7) hashMapArr[i].get("SensorBottomBorder");
        cq7 cq7Var5 = (cq7) hashMapArr[i].get("SensorRightBorder");
        if (cq7Var != null) {
            int i2 = cq7Var.a;
            ByteOrder byteOrder = this.h;
            if (i2 == 5) {
                eq7[] eq7VarArr = (eq7[]) cq7Var.h(byteOrder);
                if (eq7VarArr != null && eq7VarArr.length == 2) {
                    d = cq7.c(new eq7[]{eq7VarArr[0]}, this.h);
                    d2 = cq7.c(new eq7[]{eq7VarArr[1]}, this.h);
                } else {
                    m0.p("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eq7VarArr));
                    return;
                }
            } else {
                int[] iArr = (int[]) cq7Var.h(byteOrder);
                if (iArr != null && iArr.length == 2) {
                    d = cq7.d(iArr[0], this.h);
                    d2 = cq7.d(iArr[1], this.h);
                } else {
                    m0.p("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
            }
            hashMapArr[i].put("ImageWidth", d);
            hashMapArr[i].put("ImageLength", d2);
            return;
        }
        if (cq7Var2 != null && cq7Var3 != null && cq7Var4 != null && cq7Var5 != null) {
            int f = cq7Var2.f(this.h);
            int f2 = cq7Var4.f(this.h);
            int f3 = cq7Var5.f(this.h);
            int f4 = cq7Var3.f(this.h);
            if (f2 > f && f3 > f4) {
                cq7 d3 = cq7.d(f2 - f, this.h);
                cq7 d4 = cq7.d(f3 - f4, this.h);
                hashMapArr[i].put("ImageLength", d3);
                hashMapArr[i].put("ImageWidth", d4);
                return;
            }
            return;
        }
        cq7 cq7Var6 = (cq7) hashMapArr[i].get("ImageLength");
        cq7 cq7Var7 = (cq7) hashMapArr[i].get("ImageWidth");
        if (cq7Var6 == null || cq7Var7 == null) {
            cq7 cq7Var8 = (cq7) hashMapArr[i].get("JPEGInterchangeFormat");
            cq7 cq7Var9 = (cq7) hashMapArr[i].get("JPEGInterchangeFormatLength");
            if (cq7Var8 != null && cq7Var9 != null) {
                int f5 = cq7Var8.f(this.h);
                int f6 = cq7Var8.f(this.h);
                fq7Var.g(f5);
                byte[] bArr = new byte[f6];
                fq7Var.readFully(bArr);
                g(new bq7(bArr), f5, i);
            }
        }
    }

    public final void B() {
        z(0, 5);
        z(0, 4);
        z(5, 4);
        HashMap[] hashMapArr = this.f;
        cq7 cq7Var = (cq7) hashMapArr[1].get("PixelXDimension");
        cq7 cq7Var2 = (cq7) hashMapArr[1].get("PixelYDimension");
        if (cq7Var != null && cq7Var2 != null) {
            hashMapArr[0].put("ImageWidth", cq7Var);
            hashMapArr[0].put("ImageLength", cq7Var2);
        }
        if (hashMapArr[4].isEmpty() && r(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        r(hashMapArr[4]);
        x(0, "ThumbnailOrientation", "Orientation");
        x(0, "ThumbnailImageLength", "ImageLength");
        x(0, "ThumbnailImageWidth", "ImageWidth");
        x(5, "ThumbnailOrientation", "Orientation");
        x(5, "ThumbnailImageLength", "ImageLength");
        x(5, "ThumbnailImageWidth", "ImageWidth");
        x(4, "Orientation", "ThumbnailOrientation");
        x(4, "ImageLength", "ThumbnailImageLength");
        x(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final void a() {
        String c = c("DateTimeOriginal");
        HashMap[] hashMapArr = this.f;
        if (c != null && c("DateTime") == null) {
            hashMapArr[0].put("DateTime", cq7.a(c));
        }
        if (c("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", cq7.b(0L, this.h));
        }
        if (c("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", cq7.b(0L, this.h));
        }
        if (c("Orientation") == null) {
            hashMapArr[0].put("Orientation", cq7.b(0L, this.h));
        }
        if (c("LightSource") == null) {
            hashMapArr[1].put("LightSource", cq7.b(0L, this.h));
        }
    }

    public final String c(String str) {
        if (str != null) {
            cq7 e = e(str);
            if (e != null) {
                int i = e.a;
                if (str.equals("GPSTimeStamp")) {
                    if (i != 5 && i != 10) {
                        m0.p("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                        return null;
                    }
                    eq7[] eq7VarArr = (eq7[]) e.h(this.h);
                    if (eq7VarArr != null && eq7VarArr.length == 3) {
                        eq7 eq7Var = eq7VarArr[0];
                        Integer valueOf = Integer.valueOf((int) (((float) eq7Var.a) / ((float) eq7Var.b)));
                        eq7 eq7Var2 = eq7VarArr[1];
                        Integer valueOf2 = Integer.valueOf((int) (((float) eq7Var2.a) / ((float) eq7Var2.b)));
                        eq7 eq7Var3 = eq7VarArr[2];
                        return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (((float) eq7Var3.a) / ((float) eq7Var3.b))));
                    }
                    m0.p("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eq7VarArr));
                    return null;
                }
                boolean contains = O.contains(str);
                ByteOrder byteOrder = this.h;
                if (contains) {
                    try {
                        return Double.toString(e.e(byteOrder));
                    } catch (NumberFormatException unused) {
                    }
                } else {
                    return e.g(byteOrder);
                }
            }
            return null;
        }
        dmk.s("tag shouldn't be null");
        return null;
    }

    public final int d(int i, String str) {
        cq7 e = e(str);
        if (e != null) {
            try {
                return e.f(this.h);
            } catch (NumberFormatException unused) {
                return i;
            }
        }
        return i;
    }

    public final cq7 e(String str) {
        cq7 cq7Var;
        int i;
        cq7 cq7Var2;
        if (str != null) {
            if ("ISOSpeedRatings".equals(str)) {
                str = "PhotographicSensitivity";
            }
            if ("Xmp".equals(str) && (i = this.d) != 4 && ((i == 9 || i == 15 || i == 12 || i == 13) && (cq7Var2 = this.n) != null)) {
                return cq7Var2;
            }
            for (int i2 = 0; i2 < K.length; i2++) {
                cq7 cq7Var3 = (cq7) this.f[i2].get(str);
                if (cq7Var3 != null) {
                    return cq7Var3;
                }
            }
            if (!"Xmp".equals(str) || (cq7Var = this.n) == null) {
                return null;
            }
            return cq7Var;
        }
        dmk.s("tag shouldn't be null");
        return null;
    }

    public final void f(fq7 fq7Var) {
        String str;
        String str2;
        String str3;
        int i;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(new aq7(fq7Var));
                String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(extractMetadata3)) {
                    str = mediaMetadataRetriever.extractMetadata(29);
                    str2 = mediaMetadataRetriever.extractMetadata(30);
                    str3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(extractMetadata4)) {
                    str = mediaMetadataRetriever.extractMetadata(18);
                    str2 = mediaMetadataRetriever.extractMetadata(19);
                    str3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                HashMap[] hashMapArr = this.f;
                if (str != null) {
                    hashMapArr[0].put("ImageWidth", cq7.d(Integer.parseInt(str), this.h));
                }
                if (str2 != null) {
                    hashMapArr[0].put("ImageLength", cq7.d(Integer.parseInt(str2), this.h));
                }
                if (str3 != null) {
                    int parseInt = Integer.parseInt(str3);
                    if (parseInt != 90) {
                        if (parseInt != 180) {
                            if (parseInt != 270) {
                                i = 1;
                            } else {
                                i = 8;
                            }
                        } else {
                            i = 3;
                        }
                    } else {
                        i = 6;
                    }
                    hashMapArr[0].put("Orientation", cq7.d(i, this.h));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 > 6) {
                        fq7Var.g(parseInt2);
                        byte[] bArr = new byte[6];
                        fq7Var.readFully(bArr);
                        int i2 = parseInt2 + 6;
                        int i3 = parseInt3 - 6;
                        if (Arrays.equals(bArr, R)) {
                            byte[] bArr2 = new byte[i3];
                            fq7Var.readFully(bArr2);
                            this.j = i2;
                            v(0, bArr2);
                        } else {
                            throw new IOException("Invalid identifier");
                        }
                    } else {
                        throw new IOException("Invalid exif length");
                    }
                }
                String extractMetadata5 = mediaMetadataRetriever.extractMetadata(41);
                String extractMetadata6 = mediaMetadataRetriever.extractMetadata(42);
                if (extractMetadata5 != null && extractMetadata6 != null) {
                    int parseInt4 = Integer.parseInt(extractMetadata5);
                    int parseInt5 = Integer.parseInt(extractMetadata6);
                    long j = parseInt4;
                    fq7Var.g(j);
                    byte[] bArr3 = new byte[parseInt5];
                    fq7Var.readFully(bArr3);
                    this.n = new cq7(j, bArr3, 1, parseInt5);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } finally {
            }
        } catch (RuntimeException e) {
            throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x0060. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x0063. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0066. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0108 A[LOOP:0: B:9:0x0023->B:35:0x0108, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(bq7 bq7Var, int i, int i2) {
        String str;
        String str2;
        boolean z2 = o;
        if (z2) {
            Objects.toString(bq7Var);
        }
        bq7Var.c = ByteOrder.BIG_ENDIAN;
        byte readByte = bq7Var.readByte();
        if (readByte == -1) {
            if (bq7Var.readByte() == -40) {
                int i3 = 2;
                while (true) {
                    byte readByte2 = bq7Var.readByte();
                    if (readByte2 != -1) {
                        dmk.m(Integer.toHexString(readByte2 & MessagePack.Code.EXT_TIMESTAMP), "Invalid marker:");
                        return;
                    }
                    while (true) {
                        int i4 = i3 + 1;
                        byte readByte3 = bq7Var.readByte();
                        if (readByte3 != -1) {
                            if (z2) {
                                Integer.toHexString(readByte3 & MessagePack.Code.EXT_TIMESTAMP);
                            }
                            if (readByte3 != -39 && readByte3 != -38) {
                                int readUnsignedShort = bq7Var.readUnsignedShort();
                                int i5 = readUnsignedShort - 2;
                                int i6 = i3 + 4;
                                if (z2) {
                                    Integer.toHexString(readByte3 & MessagePack.Code.EXT_TIMESTAMP);
                                }
                                if (i5 >= 0) {
                                    if (readByte3 != -31) {
                                        HashMap[] hashMapArr = this.f;
                                        if (readByte3 != -2) {
                                            switch (readByte3) {
                                                default:
                                                    switch (readByte3) {
                                                        default:
                                                            switch (readByte3) {
                                                                default:
                                                                    switch (readByte3) {
                                                                    }
                                                                case -55:
                                                                case -54:
                                                                case -53:
                                                                    bq7Var.e(1);
                                                                    HashMap hashMap = hashMapArr[i2];
                                                                    if (i2 != 4) {
                                                                        str = "ImageLength";
                                                                    } else {
                                                                        str = "ThumbnailImageLength";
                                                                    }
                                                                    hashMap.put(str, cq7.b(bq7Var.readUnsignedShort(), this.h));
                                                                    HashMap hashMap2 = hashMapArr[i2];
                                                                    if (i2 != 4) {
                                                                        str2 = "ImageWidth";
                                                                    } else {
                                                                        str2 = "ThumbnailImageWidth";
                                                                    }
                                                                    hashMap2.put(str2, cq7.b(bq7Var.readUnsignedShort(), this.h));
                                                                    i5 = readUnsignedShort - 7;
                                                                    break;
                                                            }
                                                        case -59:
                                                        case -58:
                                                        case -57:
                                                            break;
                                                    }
                                                case -64:
                                                case -63:
                                                case -62:
                                                case -61:
                                                    break;
                                            }
                                            if (i5 < 0) {
                                                bq7Var.e(i5);
                                                i3 = i6 + i5;
                                            } else {
                                                dmk.x("Invalid length");
                                                return;
                                            }
                                        } else {
                                            byte[] bArr = new byte[i5];
                                            bq7Var.readFully(bArr);
                                            if (c("UserComment") == null) {
                                                hashMapArr[1].put("UserComment", cq7.a(new String(bArr, Q)));
                                            }
                                        }
                                    } else {
                                        byte[] bArr2 = new byte[i5];
                                        bq7Var.readFully(bArr2);
                                        int i7 = i6 + i5;
                                        byte[] bArr3 = R;
                                        if (huk.g(bArr2, bArr3)) {
                                            byte[] copyOfRange = Arrays.copyOfRange(bArr2, bArr3.length, i5);
                                            this.j = i + i6 + bArr3.length;
                                            v(i2, copyOfRange);
                                            y(new bq7(copyOfRange));
                                        } else {
                                            byte[] bArr4 = S;
                                            if (huk.g(bArr2, bArr4)) {
                                                int length = i6 + bArr4.length;
                                                byte[] copyOfRange2 = Arrays.copyOfRange(bArr2, bArr4.length, i5);
                                                this.n = new cq7(length, copyOfRange2, 1, copyOfRange2.length);
                                            }
                                        }
                                        i6 = i7;
                                    }
                                    i5 = 0;
                                    if (i5 < 0) {
                                    }
                                } else {
                                    dmk.x("Invalid length");
                                    return;
                                }
                            }
                        } else {
                            i3 = i4;
                        }
                    }
                }
                bq7Var.c = this.h;
                return;
            }
            dmk.m(Integer.toHexString(readByte & MessagePack.Code.EXT_TIMESTAMP), "Invalid marker: ");
            return;
        }
        dmk.m(Integer.toHexString(readByte & MessagePack.Code.EXT_TIMESTAMP), "Invalid marker: ");
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x00ea, code lost:
    
        if (r5 == null) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0128 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(BufferedInputStream bufferedInputStream) {
        int i;
        bq7 bq7Var;
        int i2;
        bq7 bq7Var2;
        int i3;
        long readInt;
        byte[] bArr;
        long j;
        bufferedInputStream.mark(5000);
        byte[] bArr2 = new byte[5000];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i4 = 0;
        while (true) {
            byte[] bArr3 = t;
            if (i4 >= bArr3.length) {
                return 4;
            }
            if (bArr2[i4] != bArr3[i4]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i5 = 0; i5 < bytes.length; i5++) {
                    if (bArr2[i5] != bytes[i5]) {
                        bq7 bq7Var3 = null;
                        int i6 = 1;
                        try {
                            bq7Var = new bq7(bArr2);
                            try {
                                try {
                                    readInt = bq7Var.readInt();
                                    bArr = new byte[4];
                                    bq7Var.readFully(bArr);
                                } catch (Exception unused) {
                                    i = 0;
                                }
                            } catch (Throwable th) {
                                th = th;
                                bq7Var3 = bq7Var;
                                if (bq7Var3 != null) {
                                    bq7Var3.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused2) {
                            i = 0;
                            bq7Var = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        if (Arrays.equals(bArr, u)) {
                            if (readInt == 1) {
                                readInt = bq7Var.readLong();
                                j = 16;
                                if (readInt < 16) {
                                }
                            } else {
                                j = 8;
                            }
                            if (readInt > 5000) {
                                readInt = 5000;
                            }
                            long j2 = readInt - j;
                            if (j2 >= 8) {
                                byte[] bArr4 = new byte[4];
                                boolean z2 = false;
                                boolean z3 = false;
                                boolean z4 = false;
                                for (long j3 = 0; j3 < j2 / 4; j3++) {
                                    try {
                                        bq7Var.readFully(bArr4);
                                        if (j3 != 1) {
                                            i = 0;
                                            try {
                                                if (Arrays.equals(bArr4, v)) {
                                                    z2 = true;
                                                } else if (Arrays.equals(bArr4, w)) {
                                                    z3 = true;
                                                } else if (Arrays.equals(bArr4, x) || Arrays.equals(bArr4, y)) {
                                                    z4 = true;
                                                }
                                                if (z2) {
                                                    if (z3) {
                                                        bq7Var.close();
                                                        i2 = 12;
                                                        break;
                                                    }
                                                    if (z4) {
                                                        bq7Var.close();
                                                        i2 = 15;
                                                        break;
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            } catch (Exception unused3) {
                                            }
                                        }
                                    } catch (EOFException unused4) {
                                        i = 0;
                                    }
                                }
                                i = 0;
                                bq7Var.close();
                                i2 = i;
                                if (i2 == 0) {
                                    return i2;
                                }
                                try {
                                    bq7Var2 = new bq7(bArr2);
                                } catch (Exception unused5) {
                                    bq7Var2 = null;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                                try {
                                    ByteOrder u2 = u(bq7Var2);
                                    this.h = u2;
                                    bq7Var2.c = u2;
                                    short readShort = bq7Var2.readShort();
                                    if (readShort != 20306 && readShort != 21330) {
                                        i3 = i;
                                    } else {
                                        i3 = 1;
                                    }
                                    bq7Var2.close();
                                } catch (Exception unused6) {
                                    if (bq7Var2 != null) {
                                        bq7Var2.close();
                                    }
                                    i3 = i;
                                    if (i3 == 0) {
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    bq7Var3 = bq7Var2;
                                    if (bq7Var3 != null) {
                                        bq7Var3.close();
                                    }
                                    throw th;
                                }
                                if (i3 == 0) {
                                    return 7;
                                }
                                try {
                                    bq7 bq7Var4 = new bq7(bArr2);
                                    try {
                                        ByteOrder u3 = u(bq7Var4);
                                        this.h = u3;
                                        bq7Var4.c = u3;
                                        if (bq7Var4.readShort() != 85) {
                                            i6 = i;
                                        }
                                        bq7Var4.close();
                                    } catch (Exception unused7) {
                                        bq7Var3 = bq7Var4;
                                        if (bq7Var3 != null) {
                                            bq7Var3.close();
                                        }
                                        i6 = i;
                                        if (i6 == 0) {
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        bq7Var3 = bq7Var4;
                                        if (bq7Var3 != null) {
                                            bq7Var3.close();
                                        }
                                        throw th;
                                    }
                                } catch (Exception unused8) {
                                } catch (Throwable th6) {
                                    th = th6;
                                }
                                if (i6 == 0) {
                                    return 10;
                                }
                                int i7 = i;
                                while (true) {
                                    byte[] bArr5 = B;
                                    if (i7 < bArr5.length) {
                                        if (bArr2[i7] != bArr5[i7]) {
                                            int i8 = i;
                                            while (true) {
                                                byte[] bArr6 = D;
                                                if (i8 < bArr6.length) {
                                                    if (bArr2[i8] != bArr6[i8]) {
                                                        break;
                                                    }
                                                    i8++;
                                                } else {
                                                    int i9 = i;
                                                    while (true) {
                                                        byte[] bArr7 = E;
                                                        if (i9 < bArr7.length) {
                                                            if (bArr2[bArr6.length + i9 + 4] != bArr7[i9]) {
                                                                break;
                                                            }
                                                            i9++;
                                                        } else {
                                                            return 14;
                                                        }
                                                    }
                                                }
                                            }
                                            return i;
                                        }
                                        i7++;
                                    } else {
                                        return 13;
                                    }
                                }
                            }
                        }
                        bq7Var.close();
                        i = 0;
                        i2 = 0;
                        if (i2 == 0) {
                        }
                    }
                }
                return 9;
            }
            i4++;
        }
    }

    public final void i(fq7 fq7Var) {
        int i;
        int i2;
        l(fq7Var);
        HashMap[] hashMapArr = this.f;
        cq7 cq7Var = (cq7) hashMapArr[1].get("MakerNote");
        if (cq7Var != null) {
            fq7 fq7Var2 = new fq7(cq7Var.d);
            fq7Var2.c = this.h;
            byte[] bArr = z;
            byte[] bArr2 = new byte[bArr.length];
            fq7Var2.readFully(bArr2);
            fq7Var2.g(0L);
            byte[] bArr3 = A;
            byte[] bArr4 = new byte[bArr3.length];
            fq7Var2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fq7Var2.g(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fq7Var2.g(12L);
            }
            w(fq7Var2, 6);
            cq7 cq7Var2 = (cq7) hashMapArr[7].get("PreviewImageStart");
            cq7 cq7Var3 = (cq7) hashMapArr[7].get("PreviewImageLength");
            if (cq7Var2 != null && cq7Var3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", cq7Var2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", cq7Var3);
            }
            cq7 cq7Var4 = (cq7) hashMapArr[8].get("AspectFrame");
            if (cq7Var4 != null) {
                int[] iArr = (int[]) cq7Var4.h(this.h);
                if (iArr != null && iArr.length == 4) {
                    int i3 = iArr[2];
                    int i4 = iArr[0];
                    if (i3 > i4 && (i = iArr[3]) > (i2 = iArr[1])) {
                        int i5 = (i3 - i4) + 1;
                        int i6 = (i - i2) + 1;
                        if (i5 < i6) {
                            int i7 = i5 + i6;
                            i6 = i7 - i6;
                            i5 = i7 - i6;
                        }
                        cq7 d = cq7.d(i5, this.h);
                        cq7 d2 = cq7.d(i6, this.h);
                        hashMapArr[0].put("ImageWidth", d);
                        hashMapArr[0].put("ImageLength", d2);
                        return;
                    }
                    return;
                }
                m0.p("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
            }
        }
    }

    public final void j(bq7 bq7Var) {
        if (o) {
            Objects.toString(bq7Var);
        }
        bq7Var.c = ByteOrder.BIG_ENDIAN;
        int i = bq7Var.b;
        bq7Var.e(B.length);
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            if (!z2 || !z3) {
                try {
                    int readInt = bq7Var.readInt();
                    int readInt2 = bq7Var.readInt();
                    int i2 = bq7Var.b;
                    int i3 = i2 + readInt + 4;
                    int i4 = i2 - i;
                    if (i4 == 16 && readInt2 != 1229472850) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                    }
                    if (readInt2 == 1229278788) {
                        return;
                    }
                    if (readInt2 == 1700284774 && !z2) {
                        this.j = i4;
                        byte[] bArr = new byte[readInt];
                        bq7Var.readFully(bArr);
                        int readInt3 = bq7Var.readInt();
                        CRC32 crc32 = new CRC32();
                        crc32.update(readInt2 >>> 24);
                        crc32.update(readInt2 >>> 16);
                        crc32.update(readInt2 >>> 8);
                        crc32.update(readInt2);
                        crc32.update(bArr);
                        if (((int) crc32.getValue()) == readInt3) {
                            v(0, bArr);
                            B();
                            y(new bq7(bArr));
                            z2 = true;
                        } else {
                            throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt3 + ", calculated CRC value: " + crc32.getValue());
                        }
                    } else if (readInt2 == 1767135348 && !z3) {
                        byte[] bArr2 = C;
                        if (readInt >= bArr2.length) {
                            int length = bArr2.length;
                            byte[] bArr3 = new byte[length];
                            bq7Var.readFully(bArr3);
                            if (Arrays.equals(bArr3, bArr2)) {
                                int i5 = bq7Var.b - i;
                                int i6 = readInt - length;
                                byte[] bArr4 = new byte[i6];
                                bq7Var.readFully(bArr4);
                                this.n = new cq7(i5, bArr4, 1, i6);
                                z3 = true;
                            }
                        }
                    }
                    bq7Var.e(i3 - bq7Var.b);
                } catch (EOFException e) {
                    throw new IOException("Encountered corrupt PNG file.", e);
                }
            } else {
                return;
            }
        }
    }

    public final void k(bq7 bq7Var) {
        if (o) {
            Objects.toString(bq7Var);
        }
        bq7Var.e(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bq7Var.readFully(bArr);
        bq7Var.readFully(bArr2);
        bq7Var.readFully(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        bq7Var.e(i - bq7Var.b);
        bq7Var.readFully(bArr4);
        g(new bq7(bArr4), i, 5);
        bq7Var.e(i3 - bq7Var.b);
        bq7Var.c = ByteOrder.BIG_ENDIAN;
        int readInt = bq7Var.readInt();
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = bq7Var.readUnsignedShort();
            int readUnsignedShort2 = bq7Var.readUnsignedShort();
            if (readUnsignedShort == J.a) {
                short readShort = bq7Var.readShort();
                short readShort2 = bq7Var.readShort();
                cq7 d = cq7.d(readShort, this.h);
                cq7 d2 = cq7.d(readShort2, this.h);
                HashMap[] hashMapArr = this.f;
                hashMapArr[0].put("ImageLength", d);
                hashMapArr[0].put("ImageWidth", d2);
                return;
            }
            bq7Var.e(readUnsignedShort2);
        }
    }

    public final void l(fq7 fq7Var) {
        s(fq7Var);
        w(fq7Var, 0);
        A(fq7Var, 0);
        A(fq7Var, 5);
        A(fq7Var, 4);
        B();
        if (this.d == 8) {
            HashMap[] hashMapArr = this.f;
            cq7 cq7Var = (cq7) hashMapArr[1].get("MakerNote");
            if (cq7Var != null) {
                fq7 fq7Var2 = new fq7(cq7Var.d);
                fq7Var2.c = this.h;
                fq7Var2.e(6);
                w(fq7Var2, 9);
                cq7 cq7Var2 = (cq7) hashMapArr[9].get("ColorSpace");
                if (cq7Var2 != null) {
                    hashMapArr[1].put("ColorSpace", cq7Var2);
                }
            }
        }
    }

    public final int m() {
        switch (d(1, "Orientation")) {
            case 3:
            case 4:
                return BlurConstants.H_BD;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public final void n(fq7 fq7Var) {
        if (o) {
            Objects.toString(fq7Var);
        }
        l(fq7Var);
        HashMap[] hashMapArr = this.f;
        cq7 cq7Var = (cq7) hashMapArr[0].get("JpgFromRaw");
        if (cq7Var != null) {
            g(new bq7(cq7Var.d), (int) cq7Var.c, 5);
        }
        cq7 cq7Var2 = (cq7) hashMapArr[0].get("ISO");
        cq7 cq7Var3 = (cq7) hashMapArr[1].get("PhotographicSensitivity");
        if (cq7Var2 != null && cq7Var3 == null) {
            hashMapArr[1].put("PhotographicSensitivity", cq7Var2);
        }
    }

    public final boolean o(fq7 fq7Var) {
        byte[] bArr = R;
        byte[] bArr2 = new byte[bArr.length];
        fq7Var.readFully(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            m0.p("ExifInterface", "Given data is not EXIF-only.");
            return false;
        }
        byte[] bArr3 = new byte[Barcode.FORMAT_UPC_E];
        int i = 0;
        while (true) {
            if (i == bArr3.length) {
                bArr3 = Arrays.copyOf(bArr3, bArr3.length * 2);
            }
            int read = fq7Var.a.read(bArr3, i, bArr3.length - i);
            if (read != -1) {
                i += read;
                fq7Var.b += read;
            } else {
                byte[] copyOf = Arrays.copyOf(bArr3, i);
                this.j = bArr.length;
                v(0, copyOf);
                return true;
            }
        }
    }

    public final void p(bq7 bq7Var) {
        if (o) {
            Objects.toString(bq7Var);
        }
        bq7Var.c = ByteOrder.LITTLE_ENDIAN;
        bq7Var.e(D.length);
        int readInt = bq7Var.readInt() + 8;
        byte[] bArr = E;
        bq7Var.e(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bq7Var.readFully(bArr2);
                int readInt2 = bq7Var.readInt();
                int i = length + 8;
                if (Arrays.equals(F, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    bq7Var.readFully(bArr3);
                    byte[] bArr4 = R;
                    if (huk.g(bArr3, bArr4)) {
                        bArr3 = Arrays.copyOfRange(bArr3, bArr4.length, readInt2);
                    }
                    this.j = i;
                    v(0, bArr3);
                    y(new bq7(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length <= readInt) {
                    bq7Var.e(readInt2);
                } else {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt WebP file.", e);
            }
        }
    }

    public final void q(bq7 bq7Var, HashMap hashMap) {
        cq7 cq7Var = (cq7) hashMap.get("JPEGInterchangeFormat");
        cq7 cq7Var2 = (cq7) hashMap.get("JPEGInterchangeFormatLength");
        if (cq7Var != null && cq7Var2 != null) {
            int f = cq7Var.f(this.h);
            int f2 = cq7Var2.f(this.h);
            if (this.d == 7) {
                f += this.k;
            }
            if (f > 0 && f2 > 0 && this.a == null && this.c == null && this.b == null) {
                bq7Var.e(f);
                bq7Var.readFully(new byte[f2]);
            }
        }
    }

    public final boolean r(HashMap hashMap) {
        cq7 cq7Var = (cq7) hashMap.get("ImageLength");
        cq7 cq7Var2 = (cq7) hashMap.get("ImageWidth");
        if (cq7Var != null && cq7Var2 != null) {
            int f = cq7Var.f(this.h);
            int f2 = cq7Var2.f(this.h);
            if (f <= 512 && f2 <= 512) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void s(fq7 fq7Var) {
        ByteOrder u2 = u(fq7Var);
        this.h = u2;
        fq7Var.c = u2;
        int readUnsignedShort = fq7Var.readUnsignedShort();
        int i = this.d;
        if (i != 7 && i != 10 && readUnsignedShort != 42) {
            dmk.m(Integer.toHexString(readUnsignedShort), "Invalid start code: ");
            return;
        }
        int readInt = fq7Var.readInt();
        if (readInt >= 8) {
            int i2 = readInt - 8;
            if (i2 > 0) {
                fq7Var.e(i2);
                return;
            }
            return;
        }
        dmk.x(ace.f(readInt, "Invalid first Ifd offset: "));
    }

    public final void t() {
        int i = 0;
        while (true) {
            HashMap[] hashMapArr = this.f;
            if (i < hashMapArr.length) {
                hashMapArr[i].size();
                for (Map.Entry entry : hashMapArr[i].entrySet()) {
                    cq7 cq7Var = (cq7) entry.getValue();
                    cq7Var.toString();
                    cq7Var.g(this.h);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void v(int i, byte[] bArr) {
        fq7 fq7Var = new fq7(bArr);
        s(fq7Var);
        w(fq7Var, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(fq7 fq7Var, int i) {
        boolean z2;
        HashMap[] hashMapArr;
        short s2;
        boolean z3;
        long j;
        HashMap[] hashMapArr2;
        dq7 dq7Var;
        long j2;
        boolean z4;
        int i2;
        HashMap[] hashMapArr3;
        int i3;
        dq7 dq7Var2;
        int i4;
        int readUnsignedShort;
        long j3;
        int i5;
        String str;
        int i6 = i;
        Integer valueOf = Integer.valueOf(fq7Var.b);
        HashSet hashSet = this.g;
        hashSet.add(valueOf);
        short readShort = fq7Var.readShort();
        if (readShort > 0) {
            short s3 = 0;
            while (true) {
                z2 = o;
                hashMapArr = this.f;
                if (s3 >= readShort) {
                    break;
                }
                int readUnsignedShort2 = fq7Var.readUnsignedShort();
                int readUnsignedShort3 = fq7Var.readUnsignedShort();
                int readInt = fq7Var.readInt();
                short s4 = s3;
                long j4 = fq7Var.b + 4;
                dq7 dq7Var3 = (dq7) M[i6].get(Integer.valueOf(readUnsignedShort2));
                if (z2) {
                    Integer valueOf2 = Integer.valueOf(i6);
                    j = 4;
                    Integer valueOf3 = Integer.valueOf(readUnsignedShort2);
                    if (dq7Var3 != null) {
                        str = dq7Var3.b;
                    } else {
                        str = null;
                    }
                    s2 = readShort;
                    z3 = z2;
                    String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", valueOf2, valueOf3, str, Integer.valueOf(readUnsignedShort3), Integer.valueOf(readInt));
                } else {
                    s2 = readShort;
                    z3 = z2;
                    j = 4;
                }
                if (dq7Var3 != null && readUnsignedShort3 > 0) {
                    if (readUnsignedShort3 < H.length) {
                        int i7 = dq7Var3.c;
                        if (i7 != 7 && readUnsignedShort3 != 7 && i7 != readUnsignedShort3 && (i2 = dq7Var3.d) != readUnsignedShort3 && (((i7 != 4 && i2 != 4) || readUnsignedShort3 != 3) && (((i7 != 9 && i2 != 9) || readUnsignedShort3 != 8) && ((i7 != 12 && i2 != 12) || readUnsignedShort3 != 11)))) {
                            if (z3) {
                                String str2 = G[readUnsignedShort3];
                            }
                        } else {
                            if (readUnsignedShort3 == 7) {
                                readUnsignedShort3 = i7;
                            }
                            hashMapArr2 = hashMapArr;
                            dq7Var = dq7Var3;
                            j2 = readInt * r15[readUnsignedShort3];
                            if (j2 >= 0 && j2 <= 2147483647L) {
                                z4 = true;
                                if (!z4) {
                                    fq7Var.g(j4);
                                } else {
                                    if (j2 > j) {
                                        int readInt2 = fq7Var.readInt();
                                        if (this.d == 7) {
                                            hashMapArr3 = hashMapArr2;
                                            dq7Var2 = dq7Var;
                                            if ("MakerNote".equals(dq7Var2.b)) {
                                                this.k = readInt2;
                                            } else if (i6 == 6 && "ThumbnailImage".equals(dq7Var2.b)) {
                                                this.l = readInt2;
                                                this.m = readInt;
                                                cq7 d = cq7.d(6, this.h);
                                                i3 = readUnsignedShort2;
                                                cq7 b = cq7.b(this.l, this.h);
                                                i4 = readInt;
                                                cq7 b2 = cq7.b(this.m, this.h);
                                                hashMapArr3[4].put("Compression", d);
                                                hashMapArr3[4].put("JPEGInterchangeFormat", b);
                                                hashMapArr3[4].put("JPEGInterchangeFormatLength", b2);
                                                fq7Var.g(readInt2);
                                            }
                                            i3 = readUnsignedShort2;
                                        } else {
                                            hashMapArr3 = hashMapArr2;
                                            i3 = readUnsignedShort2;
                                            dq7Var2 = dq7Var;
                                        }
                                        i4 = readInt;
                                        fq7Var.g(readInt2);
                                    } else {
                                        hashMapArr3 = hashMapArr2;
                                        i3 = readUnsignedShort2;
                                        dq7Var2 = dq7Var;
                                        i4 = readInt;
                                    }
                                    Integer num = (Integer) P.get(Integer.valueOf(i3));
                                    if (num != null) {
                                        if (readUnsignedShort3 != 3) {
                                            if (readUnsignedShort3 != 4) {
                                                if (readUnsignedShort3 != 8) {
                                                    if (readUnsignedShort3 != 9 && readUnsignedShort3 != 13) {
                                                        j3 = -1;
                                                    } else {
                                                        readUnsignedShort = fq7Var.readInt();
                                                    }
                                                } else {
                                                    readUnsignedShort = fq7Var.readShort();
                                                }
                                            } else {
                                                j3 = fq7Var.readInt() & 4294967295L;
                                            }
                                            if (z3) {
                                                String.format("Offset: %d, tagName: %s", Long.valueOf(j3), dq7Var2.b);
                                            }
                                            if (j3 > 0 && (((i5 = fq7Var.e) == -1 || j3 < i5) && !hashSet.contains(Integer.valueOf((int) j3)))) {
                                                fq7Var.g(j3);
                                                w(fq7Var, num.intValue());
                                            }
                                            fq7Var.g(j4);
                                        } else {
                                            readUnsignedShort = fq7Var.readUnsignedShort();
                                        }
                                        j3 = readUnsignedShort;
                                        if (z3) {
                                        }
                                        if (j3 > 0) {
                                            fq7Var.g(j3);
                                            w(fq7Var, num.intValue());
                                        }
                                        fq7Var.g(j4);
                                    } else {
                                        int i8 = fq7Var.b + this.j;
                                        byte[] bArr = new byte[(int) j2];
                                        fq7Var.readFully(bArr);
                                        cq7 cq7Var = new cq7(i8, bArr, readUnsignedShort3, i4);
                                        HashMap hashMap = hashMapArr3[i];
                                        String str3 = dq7Var2.b;
                                        hashMap.put(str3, cq7Var);
                                        if ("DNGVersion".equals(str3)) {
                                            this.d = 3;
                                        }
                                        if ((("Make".equals(str3) || "Model".equals(str3)) && cq7Var.g(this.h).contains("PENTAX")) || ("Compression".equals(str3) && cq7Var.f(this.h) == 65535)) {
                                            this.d = 8;
                                        }
                                        if (fq7Var.b != j4) {
                                            fq7Var.g(j4);
                                        }
                                    }
                                }
                                s3 = (short) (s4 + 1);
                                i6 = i;
                                readShort = s2;
                            }
                            z4 = false;
                            if (!z4) {
                            }
                            s3 = (short) (s4 + 1);
                            i6 = i;
                            readShort = s2;
                        }
                    }
                }
                dq7Var = dq7Var3;
                hashMapArr2 = hashMapArr;
                j2 = 0;
                z4 = false;
                if (!z4) {
                }
                s3 = (short) (s4 + 1);
                i6 = i;
                readShort = s2;
            }
            int readInt3 = fq7Var.readInt();
            if (z2) {
                String.format("nextIfdOffset: %d", Integer.valueOf(readInt3));
            }
            long j5 = readInt3;
            if (j5 > 0 && !hashSet.contains(Integer.valueOf(readInt3))) {
                fq7Var.g(j5);
                if (hashMapArr[4].isEmpty()) {
                    w(fq7Var, 4);
                } else if (hashMapArr[5].isEmpty()) {
                    w(fq7Var, 5);
                }
            }
        }
    }

    public final void x(int i, String str, String str2) {
        HashMap[] hashMapArr = this.f;
        if (!hashMapArr[i].isEmpty() && hashMapArr[i].get(str) != null) {
            HashMap hashMap = hashMapArr[i];
            hashMap.put(str2, (cq7) hashMap.get(str));
            hashMapArr[i].remove(str);
        }
    }

    public final void y(bq7 bq7Var) {
        cq7 cq7Var;
        HashMap hashMap = this.f[4];
        cq7 cq7Var2 = (cq7) hashMap.get("Compression");
        if (cq7Var2 != null) {
            int f = cq7Var2.f(this.h);
            if (f != 1) {
                if (f != 6) {
                    if (f != 7) {
                        return;
                    }
                } else {
                    q(bq7Var, hashMap);
                    return;
                }
            }
            cq7 cq7Var3 = (cq7) hashMap.get("BitsPerSample");
            if (cq7Var3 != null) {
                int[] iArr = (int[]) cq7Var3.h(this.h);
                int[] iArr2 = r;
                if (!Arrays.equals(iArr2, iArr)) {
                    if (this.d == 3 && (cq7Var = (cq7) hashMap.get("PhotometricInterpretation")) != null) {
                        int f2 = cq7Var.f(this.h);
                        if ((f2 != 1 || !Arrays.equals(iArr, s)) && (f2 != 6 || !Arrays.equals(iArr, iArr2))) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                cq7 cq7Var4 = (cq7) hashMap.get("StripOffsets");
                cq7 cq7Var5 = (cq7) hashMap.get("StripByteCounts");
                if (cq7Var4 != null && cq7Var5 != null) {
                    long[] f3 = huk.f(cq7Var4.h(this.h));
                    long[] f4 = huk.f(cq7Var5.h(this.h));
                    if (f3 != null && f3.length != 0) {
                        if (f4 != null && f4.length != 0) {
                            if (f3.length != f4.length) {
                                m0.p("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                                return;
                            }
                            long j = 0;
                            for (long j2 : f4) {
                                j += j2;
                            }
                            byte[] bArr = new byte[(int) j];
                            this.i = true;
                            int i = 0;
                            int i2 = 0;
                            for (int i3 = 0; i3 < f3.length; i3++) {
                                int i4 = (int) f3[i3];
                                int i5 = (int) f4[i3];
                                if (i3 < f3.length - 1 && i4 + i5 != f3[i3 + 1]) {
                                    this.i = false;
                                }
                                int i6 = i4 - i;
                                if (i6 >= 0) {
                                    try {
                                        bq7Var.e(i6);
                                        int i7 = i + i6;
                                        byte[] bArr2 = new byte[i5];
                                        bq7Var.readFully(bArr2);
                                        i = i7 + i5;
                                        System.arraycopy(bArr2, 0, bArr, i2, i5);
                                        i2 += i5;
                                    } catch (EOFException unused) {
                                        return;
                                    }
                                }
                                return;
                            }
                            if (this.i) {
                                long j3 = f3[0];
                                return;
                            }
                            return;
                        }
                        m0.p("ExifInterface", "stripByteCounts should not be null or have zero length.");
                        return;
                    }
                    m0.p("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                return;
            }
            return;
        }
        q(bq7Var, hashMap);
    }

    public final void z(int i, int i2) {
        HashMap[] hashMapArr = this.f;
        if (!hashMapArr[i].isEmpty() && !hashMapArr[i2].isEmpty()) {
            cq7 cq7Var = (cq7) hashMapArr[i].get("ImageLength");
            cq7 cq7Var2 = (cq7) hashMapArr[i].get("ImageWidth");
            cq7 cq7Var3 = (cq7) hashMapArr[i2].get("ImageLength");
            cq7 cq7Var4 = (cq7) hashMapArr[i2].get("ImageWidth");
            if (cq7Var != null && cq7Var2 != null && cq7Var3 != null && cq7Var4 != null) {
                int f = cq7Var.f(this.h);
                int f2 = cq7Var2.f(this.h);
                int f3 = cq7Var3.f(this.h);
                int f4 = cq7Var4.f(this.h);
                if (f < f3 && f2 < f4) {
                    HashMap hashMap = hashMapArr[i];
                    hashMapArr[i] = hashMapArr[i2];
                    hashMapArr[i2] = hashMap;
                }
            }
        }
    }
}
