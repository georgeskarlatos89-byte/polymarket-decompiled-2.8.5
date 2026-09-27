package com.socure.docv.capturesdk.common.upload;

import com.socure.docv.capturesdk.common.network.model.stepup.UploadImage;
import com.socure.docv.capturesdk.core.processor.model.Output;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class b {
    public final UploadImage a;
    public final Output b;
    public final ArrayList c;
    public final String d;

    public b(UploadImage uploadImage, Output output, ArrayList arrayList, String str) {
        uploadImage.getClass();
        this.a = uploadImage;
        this.b = output;
        this.c = arrayList;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (!Intrinsics.areEqual(this.a, bVar.a) || !Intrinsics.areEqual(this.b, bVar.b) || !Intrinsics.areEqual(this.c, bVar.c) || !Intrinsics.areEqual(this.d, bVar.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            hashCode = 0;
        } else {
            hashCode = arrayList.hashCode();
        }
        return this.d.hashCode() + ((hashCode2 + hashCode) * 31);
    }

    public final String toString() {
        return "ImageUploadResponse(uploadImage=" + this.a + ", output=" + this.b + ", faces=" + this.c + ", errorMessage=" + this.d + ")";
    }
}
