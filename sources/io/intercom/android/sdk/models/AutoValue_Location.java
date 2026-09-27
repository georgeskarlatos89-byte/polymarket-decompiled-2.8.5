package io.intercom.android.sdk.models;

import com.fingerprintjs.android.fpjs_pro.g;
import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
final class AutoValue_Location extends Location {
    private final String cityName;
    private final String countryName;
    private final Integer timezoneOffset;

    public AutoValue_Location(String str, String str2, Integer num) {
        if (str != null) {
            this.cityName = str;
            if (str2 != null) {
                this.countryName = str2;
                this.timezoneOffset = num;
                return;
            } else {
                dmk.s("Null countryName");
                throw null;
            }
        }
        dmk.s("Null cityName");
        throw null;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Location) {
            Location location = (Location) obj;
            if (this.cityName.equals(location.getCityName()) && this.countryName.equals(location.getCountryName()) && ((num = this.timezoneOffset) != null ? num.equals(location.getTimezoneOffset()) : location.getTimezoneOffset() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // io.intercom.android.sdk.models.Location
    public String getCityName() {
        return this.cityName;
    }

    @Override // io.intercom.android.sdk.models.Location
    public String getCountryName() {
        return this.countryName;
    }

    @Override // io.intercom.android.sdk.models.Location
    public Integer getTimezoneOffset() {
        return this.timezoneOffset;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((this.cityName.hashCode() ^ 1000003) * 1000003) ^ this.countryName.hashCode()) * 1000003;
        Integer num = this.timezoneOffset;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return hashCode ^ hashCode2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Location{cityName=");
        sb.append(this.cityName);
        sb.append(", countryName=");
        sb.append(this.countryName);
        sb.append(", timezoneOffset=");
        return g.p(sb, this.timezoneOffset, "}");
    }
}
