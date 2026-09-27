package defpackage;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class i9d extends JsonAdapter {
    public final JsonAdapter h;

    public i9d(JsonAdapter jsonAdapter) {
        this.h = jsonAdapter;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        if (jsonReader.p() != sfa.NULL) {
            return this.h.fromJson(jsonReader);
        }
        throw new RuntimeException("Unexpected null at ".concat(jsonReader.e()));
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(wga wgaVar, Object obj) {
        if (obj != null) {
            this.h.toJson(wgaVar, obj);
            return;
        }
        throw new RuntimeException("Unexpected null at ".concat(wgaVar.z()));
    }

    public final String toString() {
        return this.h + ".nonNull()";
    }
}
