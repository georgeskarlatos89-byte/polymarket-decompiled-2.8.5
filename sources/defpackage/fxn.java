package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class fxn {
    public static Bundle a(Parcel parcel, int i) {
        int t = t(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (t == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + t);
        return readBundle;
    }

    public static byte[] b(Parcel parcel, int i) {
        int t = t(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (t == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + t);
        return createByteArray;
    }

    public static byte[][] c(Parcel parcel, int i) {
        int t = t(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (t == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            bArr[i2] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + t);
        return bArr;
    }

    public static int[] d(Parcel parcel, int i) {
        int t = t(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (t == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + t);
        return createIntArray;
    }

    public static ArrayList e(Parcel parcel, int i) {
        int t = t(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (t == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + t);
        return arrayList;
    }

    public static Parcelable f(Parcel parcel, int i, Parcelable.Creator creator) {
        int t = t(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (t == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + t);
        return parcelable;
    }

    public static String g(Parcel parcel, int i) {
        int t = t(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (t == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + t);
        return readString;
    }

    public static String[] h(Parcel parcel, int i) {
        int t = t(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (t == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + t);
        return createStringArray;
    }

    public static ArrayList i(Parcel parcel, int i) {
        int t = t(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (t == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + t);
        return createStringArrayList;
    }

    public static Object[] j(Parcel parcel, int i, Parcelable.Creator creator) {
        int t = t(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (t == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + t);
        return createTypedArray;
    }

    public static ArrayList k(Parcel parcel, int i, Parcelable.Creator creator) {
        int t = t(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (t == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + t);
        return createTypedArrayList;
    }

    public static void l(Parcel parcel, int i) {
        if (parcel.dataPosition() == i) {
        } else {
            throw new adg(hdi.l(i, "Overread allowed size end=", new StringBuilder(String.valueOf(i).length() + 26)), parcel);
        }
    }

    public static boolean m(Parcel parcel, int i) {
        w(parcel, i, 4);
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    public static double n(Parcel parcel, int i) {
        w(parcel, i, 8);
        return parcel.readDouble();
    }

    public static float o(Parcel parcel, int i) {
        w(parcel, i, 4);
        return parcel.readFloat();
    }

    public static IBinder p(Parcel parcel, int i) {
        int t = t(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (t == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + t);
        return readStrongBinder;
    }

    public static int q(Parcel parcel, int i) {
        w(parcel, i, 4);
        return parcel.readInt();
    }

    public static Integer r(Parcel parcel, int i) {
        int t = t(parcel, i);
        if (t == 0) {
            return null;
        }
        x(parcel, t, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long s(Parcel parcel, int i) {
        w(parcel, i, 8);
        return parcel.readLong();
    }

    public static int t(Parcel parcel, int i) {
        if ((i & (-65536)) != -65536) {
            return (char) (i >> 16);
        }
        return parcel.readInt();
    }

    public static void u(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + t(parcel, i));
    }

    public static int v(Parcel parcel) {
        int readInt = parcel.readInt();
        int t = t(parcel, readInt);
        char c = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c == 20293) {
            int i = t + dataPosition;
            if (i >= dataPosition && i <= parcel.dataSize()) {
                return i;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(dataPosition).length() + 32 + String.valueOf(i).length());
            sb.append("Size read is invalid start=");
            sb.append(dataPosition);
            sb.append(" end=");
            sb.append(i);
            throw new adg(sb.toString(), parcel);
        }
        throw new adg("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
    }

    public static void w(Parcel parcel, int i, int i2) {
        int t = t(parcel, i);
        if (t == i2) {
            return;
        }
        String hexString = Integer.toHexString(t);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(t).length() + 4 + 1);
        sv6.w(i2, t, "Expected size ", " got ", sb);
        throw new adg(ix2.p(sb, " (0x", hexString, ")"), parcel);
    }

    public static void x(Parcel parcel, int i, int i2) {
        if (i == i2) {
            return;
        }
        String hexString = Integer.toHexString(i);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(i).length() + 4 + 1);
        sv6.w(i2, i, "Expected size ", " got ", sb);
        throw new adg(ix2.p(sb, " (0x", hexString, ")"), parcel);
    }
}
