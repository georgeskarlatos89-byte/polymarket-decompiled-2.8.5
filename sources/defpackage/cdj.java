package defpackage;

import com.polymarket.android.R;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@exg
/* loaded from: classes5.dex */
public final class cdj {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ cdj[] $VALUES;
    private static final Lazy<KSerializer> $cachedSerializer$delegate;

    @dxg("address.label.name")
    public static final cdj AddressName;

    @dxg("upe.labels.name.onAccount")
    public static final cdj AuBecsAccountName;
    public static final bdj Companion;

    @dxg("upe.labels.eps.bank")
    public static final cdj EpsBank;

    @dxg("upe.labels.fpx.bank")
    public static final cdj FpxBank;

    @dxg("upe.labels.ideal.bank")
    public static final cdj IdealBank;

    @dxg("upe.labels.p24.bank")
    public static final cdj P24Bank;
    private final int resourceId;

    /* JADX WARN: Type inference failed for: r0v2, types: [bdj, java.lang.Object] */
    static {
        cdj cdjVar = new cdj("IdealBank", 0, R.string.stripe_ideal_bank);
        IdealBank = cdjVar;
        cdj cdjVar2 = new cdj("P24Bank", 1, R.string.stripe_p24_bank);
        P24Bank = cdjVar2;
        cdj cdjVar3 = new cdj("EpsBank", 2, R.string.stripe_eps_bank);
        EpsBank = cdjVar3;
        cdj cdjVar4 = new cdj("FpxBank", 3, R.string.stripe_fpx_bank);
        FpxBank = cdjVar4;
        cdj cdjVar5 = new cdj("AddressName", 4, R.string.stripe_address_label_full_name);
        AddressName = cdjVar5;
        cdj cdjVar6 = new cdj("AuBecsAccountName", 5, R.string.stripe_au_becs_account_name);
        AuBecsAccountName = cdjVar6;
        cdj[] cdjVarArr = {cdjVar, cdjVar2, cdjVar3, cdjVar4, cdjVar5, cdjVar6};
        $VALUES = cdjVarArr;
        $ENTRIES = new wg7(cdjVarArr);
        Companion = new Object();
        $cachedSerializer$delegate = LazyKt.a(w4b.PUBLICATION, new nyi(29));
    }

    public cdj(String str, int i, int i2) {
        this.resourceId = i2;
    }

    public static final /* synthetic */ Lazy a() {
        return $cachedSerializer$delegate;
    }

    public static cdj valueOf(String str) {
        return (cdj) Enum.valueOf(cdj.class, str);
    }

    public static cdj[] values() {
        return (cdj[]) $VALUES.clone();
    }

    public final int b() {
        return this.resourceId;
    }
}
