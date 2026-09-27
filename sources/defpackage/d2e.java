package defpackage;

import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class d2e implements Parcelable.Creator {
    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r18) {
        /*
            r17 = this;
            r0 = r18
            r0.getClass()
            e2e r1 = new e2e
            java.lang.String r2 = r0.readString()
            java.lang.String r3 = ""
            if (r2 != 0) goto L10
            r2 = r3
        L10:
            int r4 = r0.readInt()
            java.lang.String r5 = r0.readString()
            if (r5 != 0) goto L1b
            r5 = r3
        L1b:
            java.lang.String r6 = r0.readString()
            if (r6 != 0) goto L25
            r6 = r3
            r7 = r6
        L23:
            r3 = r5
            goto L27
        L25:
            r7 = r3
            goto L23
        L27:
            java.lang.String r5 = r0.readString()
            byte r8 = r0.readByte()
            r9 = 0
            r10 = 1
            if (r8 == 0) goto L39
            r8 = r1
            r1 = r2
            r2 = r4
            r4 = r6
            r6 = r10
            goto L3e
        L39:
            r8 = r1
            r1 = r2
            r2 = r4
            r4 = r6
            r6 = r9
        L3e:
            java.lang.Class<m9i> r11 = defpackage.m9i.class
            java.lang.ClassLoader r11 = r11.getClassLoader()
            android.os.Parcelable r11 = r0.readParcelable(r11)
            m9i r11 = (defpackage.m9i) r11
            r12 = r8
            java.lang.String r8 = r0.readString()
            byte r13 = r0.readByte()
            if (r13 == 0) goto L58
            r13 = r9
            r9 = r10
            goto L59
        L58:
            r13 = r9
        L59:
            byte r14 = r0.readByte()
            if (r14 == 0) goto L61
            r14 = r10
            goto L63
        L61:
            r14 = r10
            r10 = r13
        L63:
            java.lang.Class r15 = java.lang.Integer.TYPE
            java.lang.ClassLoader r15 = r15.getClassLoader()
            java.lang.Object r15 = r0.readValue(r15)
            boolean r13 = r15 instanceof java.lang.Integer
            if (r13 == 0) goto L74
            java.lang.Integer r15 = (java.lang.Integer) r15
            goto L75
        L74:
            r15 = 0
        L75:
            java.lang.String r13 = r0.readString()
            if (r13 != 0) goto L7c
            goto L7d
        L7c:
            r7 = r13
        L7d:
            byte r13 = r0.readByte()
            if (r13 == 0) goto L87
            r13 = r14
            r16 = r13
            goto L8a
        L87:
            r16 = r14
            r13 = 0
        L8a:
            java.lang.String r14 = r0.readString()
            byte r0 = r0.readByte()
            if (r0 == 0) goto L9b
            r0 = r12
            r12 = r7
            r7 = r11
            r11 = r15
            r15 = r16
            goto La0
        L9b:
            r0 = r12
            r12 = r7
            r7 = r11
            r11 = r15
            r15 = 0
        La0:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d2e.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new e2e[i];
    }
}
