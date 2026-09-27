package defpackage;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.polymarket.android.R;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@exg
/* loaded from: classes5.dex */
public final class nsc {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ nsc[] $VALUES;
    private static final Lazy<KSerializer> $cachedSerializer$delegate;

    @dxg("area")
    public static final nsc Area;

    @dxg("cedex")
    public static final nsc Cedex;

    @dxg("city")
    public static final nsc City;
    public static final msc Companion;

    @dxg("country")
    public static final nsc Country;

    @dxg("county")
    public static final nsc County;

    @dxg("department")
    public static final nsc Department;

    @dxg("district")
    public static final nsc District;

    @dxg("do_si")
    public static final nsc DoSi;

    @dxg("eircode")
    public static final nsc Eircode;

    @dxg("emirate")
    public static final nsc Emirate;

    @dxg("island")
    public static final nsc Island;

    @dxg(PlaceTypes.NEIGHBORHOOD)
    public static final nsc Neighborhood;

    @dxg("oblast")
    public static final nsc Oblast;

    @dxg("parish")
    public static final nsc Parish;

    @dxg("prefecture")
    public static final nsc Perfecture;

    @dxg("pin")
    public static final nsc Pin;

    @dxg("post_town")
    public static final nsc PostTown;

    @dxg("postal")
    public static final nsc Postal;

    @dxg("province")
    public static final nsc Province;

    @dxg("state")
    public static final nsc State;

    @dxg("suburb")
    public static final nsc Suburb;

    @dxg("suburb_or_city")
    public static final nsc SuburbOrCity;

    @dxg("townland")
    public static final nsc Townload;

    @dxg("village_township")
    public static final nsc VillageTownship;

    @dxg("zip")
    public static final nsc Zip;
    private final int stringResId;

    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, msc] */
    static {
        nsc nscVar = new nsc("Area", 0, R.string.stripe_address_label_hk_area);
        Area = nscVar;
        nsc nscVar2 = new nsc("Cedex", 1, R.string.stripe_address_label_cedex);
        Cedex = nscVar2;
        nsc nscVar3 = new nsc("City", 2, R.string.stripe_address_label_city);
        City = nscVar3;
        nsc nscVar4 = new nsc("Country", 3, R.string.stripe_address_label_country_or_region);
        Country = nscVar4;
        nsc nscVar5 = new nsc("County", 4, R.string.stripe_address_label_county);
        County = nscVar5;
        nsc nscVar6 = new nsc("Department", 5, R.string.stripe_address_label_department);
        Department = nscVar6;
        nsc nscVar7 = new nsc("District", 6, R.string.stripe_address_label_district);
        District = nscVar7;
        nsc nscVar8 = new nsc("DoSi", 7, R.string.stripe_address_label_kr_do_si);
        DoSi = nscVar8;
        nsc nscVar9 = new nsc("Eircode", 8, R.string.stripe_address_label_ie_eircode);
        Eircode = nscVar9;
        nsc nscVar10 = new nsc("Emirate", 9, R.string.stripe_address_label_ae_emirate);
        Emirate = nscVar10;
        nsc nscVar11 = new nsc("Island", 10, R.string.stripe_address_label_island);
        Island = nscVar11;
        nsc nscVar12 = new nsc("Neighborhood", 11, R.string.stripe_address_label_neighborhood);
        Neighborhood = nscVar12;
        nsc nscVar13 = new nsc("Oblast", 12, R.string.stripe_address_label_oblast);
        Oblast = nscVar13;
        nsc nscVar14 = new nsc("Parish", 13, R.string.stripe_address_label_bb_jm_parish);
        Parish = nscVar14;
        nsc nscVar15 = new nsc("Pin", 14, R.string.stripe_address_label_in_pin);
        Pin = nscVar15;
        nsc nscVar16 = new nsc("PostTown", 15, R.string.stripe_address_label_post_town);
        PostTown = nscVar16;
        nsc nscVar17 = new nsc("Postal", 16, R.string.stripe_address_label_postal_code);
        Postal = nscVar17;
        nsc nscVar18 = new nsc("Perfecture", 17, R.string.stripe_address_label_jp_prefecture);
        Perfecture = nscVar18;
        nsc nscVar19 = new nsc("Province", 18, R.string.stripe_address_label_province);
        Province = nscVar19;
        nsc nscVar20 = new nsc("State", 19, R.string.stripe_address_label_state);
        State = nscVar20;
        nsc nscVar21 = new nsc("Suburb", 20, R.string.stripe_address_label_suburb);
        Suburb = nscVar21;
        nsc nscVar22 = new nsc("SuburbOrCity", 21, R.string.stripe_address_label_au_suburb_or_city);
        SuburbOrCity = nscVar22;
        nsc nscVar23 = new nsc("Townload", 22, R.string.stripe_address_label_ie_townland);
        Townload = nscVar23;
        nsc nscVar24 = new nsc("VillageTownship", 23, R.string.stripe_address_label_village_township);
        VillageTownship = nscVar24;
        nsc nscVar25 = new nsc("Zip", 24, R.string.stripe_address_label_zip_code);
        Zip = nscVar25;
        nsc[] nscVarArr = {nscVar, nscVar2, nscVar3, nscVar4, nscVar5, nscVar6, nscVar7, nscVar8, nscVar9, nscVar10, nscVar11, nscVar12, nscVar13, nscVar14, nscVar15, nscVar16, nscVar17, nscVar18, nscVar19, nscVar20, nscVar21, nscVar22, nscVar23, nscVar24, nscVar25};
        $VALUES = nscVarArr;
        $ENTRIES = new wg7(nscVarArr);
        Companion = new Object();
        $cachedSerializer$delegate = LazyKt.a(w4b.PUBLICATION, new isc(1));
    }

    public nsc(String str, int i, int i2) {
        this.stringResId = i2;
    }

    public static final /* synthetic */ Lazy a() {
        return $cachedSerializer$delegate;
    }

    public static nsc valueOf(String str) {
        return (nsc) Enum.valueOf(nsc.class, str);
    }

    public static nsc[] values() {
        return (nsc[]) $VALUES.clone();
    }

    public final int b() {
        return this.stringResId;
    }
}
