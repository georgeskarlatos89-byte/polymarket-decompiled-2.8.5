package defpackage;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ucd extends JsonAdapter {
    public final JsonAdapter h;

    public ucd(JsonAdapter jsonAdapter) {
        this.h = jsonAdapter;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        if (jsonReader.p() == sfa.NULL) {
            jsonReader.o();
            return null;
        }
        return this.h.fromJson(jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(wga wgaVar, Object obj) {
        if (obj == null) {
            wgaVar.D();
        } else {
            this.h.toJson(wgaVar, obj);
        }
    }

    public final String toString() {
        return this.h + ".nullSafe()";
    }
}
