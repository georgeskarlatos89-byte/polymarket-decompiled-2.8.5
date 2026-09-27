package defpackage;

import com.polymarket.android.R;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class eh extends hh {
    public final List c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public eh() {
        super(r1, 0);
        List listOf = CollectionsKt.listOf(new Pair("AC", "Acre"), new Pair("AL", "Alagoas"), new Pair("AP", "Amapá"), new Pair("AM", "Amazonas"), new Pair("BA", "Bahia"), new Pair("CE", "Ceará"), new Pair("DF", "Distrito Federal"), new Pair("ES", "Espírito Santo"), new Pair("GO", "Goiás"), new Pair("MA", "Maranhão"), new Pair("MT", "Mato Grosso"), new Pair("MS", "Mato Grosso do Sul"), new Pair("MG", "Minas Gerais"), new Pair("PA", "Pará"), new Pair("PB", "Paraíba"), new Pair("PR", "Paraná"), new Pair("PE", "Pernambuco"), new Pair("PI", "Piauí"), new Pair("RJ", "Rio de Janeiro"), new Pair("RN", "Rio Grande do Norte"), new Pair("RS", "Rio Grande do Sul"), new Pair("RO", "Rondônia"), new Pair("RR", "Roraima"), new Pair("SC", "Santa Catarina"), new Pair("SP", "São Paulo"), new Pair("SE", "Sergipe"), new Pair("TO", "Tocantins"));
        listOf.getClass();
        this.c = listOf;
    }

    @Override // defpackage.hh
    public final List d() {
        return this.c;
    }

    @Override // defpackage.hh
    public final int e() {
        return R.string.stripe_address_label_state;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof eh) || !Intrinsics.areEqual(this.c, ((eh) obj).c)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Integer.hashCode(R.string.stripe_address_label_state) * 31);
    }

    @Override // defpackage.hh
    public final String toString() {
        return hdi.q("Brazil(label=2132084260, administrativeAreas=", ")", this.c);
    }
}
