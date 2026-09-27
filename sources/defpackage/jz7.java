package defpackage;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.polymarket.android.R;
import com.socure.docv.capturesdk.api.Keys;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@exg
/* loaded from: classes5.dex */
public class jz7 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ jz7[] $VALUES;
    private static final Lazy<KSerializer> $cachedSerializer$delegate;

    @dxg("addressLine1")
    public static final jz7 AddressLine1;

    @dxg("addressLine2")
    public static final jz7 AddressLine2;

    @dxg("administrativeArea")
    public static final jz7 AdministrativeArea;
    public static final fz7 Companion;

    @dxg("dependentLocality")
    public static final jz7 DependentLocality;

    @dxg(PlaceTypes.LOCALITY)
    public static final jz7 Locality;

    @dxg(Keys.KEY_NAME)
    public static final jz7 Name;

    @dxg("postalCode")
    public static final jz7 PostalCode;

    @dxg("sortingCode")
    public static final jz7 SortingCode;
    private final int defaultLabel;
    private final ll9 identifierSpec;
    private final String serializedValue;

    /* JADX WARN: Type inference failed for: r0v9, types: [fz7, java.lang.Object] */
    static {
        ll9.Companion.getClass();
        jz7 jz7Var = new jz7("AddressLine1", 0, "addressLine1", ll9.o, R.string.stripe_address_label_address_line1);
        AddressLine1 = jz7Var;
        jz7 jz7Var2 = new jz7("AddressLine2", 1, "addressLine2", ll9.p, R.string.stripe_address_label_address_line2);
        AddressLine2 = jz7Var2;
        jz7 jz7Var3 = new jz7("Locality", 2, PlaceTypes.LOCALITY, ll9.q, R.string.stripe_address_label_city);
        Locality = jz7Var3;
        jz7 jz7Var4 = new jz7("DependentLocality", 3, "dependentLocality", ll9.r, R.string.stripe_address_label_city);
        DependentLocality = jz7Var4;
        jz7 jz7Var5 = new jz7("PostalCode", 4, "postalCode", ll9.s, R.string.stripe_address_label_postal_code);
        PostalCode = jz7Var5;
        jz7 jz7Var6 = new jz7("SortingCode", 5, "sortingCode", ll9.t, R.string.stripe_address_label_postal_code);
        SortingCode = jz7Var6;
        jz7 jz7Var7 = new jz7("AdministrativeArea", 6, "administrativeArea", ll9.u, nsc.State.b());
        AdministrativeArea = jz7Var7;
        jz7 jz7Var8 = new jz7("Name", 7, Keys.KEY_NAME, ll9.e, R.string.stripe_address_label_full_name);
        Name = jz7Var8;
        jz7[] jz7VarArr = {jz7Var, jz7Var2, jz7Var3, jz7Var4, jz7Var5, jz7Var6, jz7Var7, jz7Var8};
        $VALUES = jz7VarArr;
        $ENTRIES = new wg7(jz7VarArr);
        Companion = new Object();
        $cachedSerializer$delegate = LazyKt.a(w4b.PUBLICATION, new tw7(8));
    }

    public jz7(String str, int i, String str2, ll9 ll9Var, int i2) {
        this.serializedValue = str2;
        this.identifierSpec = ll9Var;
        this.defaultLabel = i2;
    }

    public static final /* synthetic */ Lazy a() {
        return $cachedSerializer$delegate;
    }

    public static ug7 d() {
        return $ENTRIES;
    }

    public static jz7 valueOf(String str) {
        return (jz7) Enum.valueOf(jz7.class, str);
    }

    public static jz7[] values() {
        return (jz7[]) $VALUES.clone();
    }

    public int b() {
        return 2;
    }

    public final int c() {
        return this.defaultLabel;
    }

    public final ll9 e() {
        return this.identifierSpec;
    }
}
