package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class o4j {
    public final byte[] a;
    public final ArrayList b;

    public o4j(byte[] bArr, ArrayList arrayList) {
        this.a = bArr;
        this.b = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            this.b.add(Arrays.copyOf(bArr2, bArr2.length));
        }
    }

    public static o4j a(ArrayList arrayList, String str) {
        Collections.sort(arrayList, new tp(25));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeUTF(str);
        dataOutputStream.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byte[] bArr = (byte[]) it.next();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
        dataOutputStream.flush();
        return new o4j(byteArrayOutputStream.toByteArray(), arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o4j.class == obj.getClass()) {
            return Arrays.equals(this.a, ((o4j) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }
}
