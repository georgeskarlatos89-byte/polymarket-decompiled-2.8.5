package skip.unit;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.f27;
import defpackage.ls3;
import defpackage.ofn;
import defpackage.v9j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0017J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0017J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u001d\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b2\b\u0010\f\u001a\u0004\u0018\u0001H\u000bH\u0016¢\u0006\u0002\u0010\rJ%\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b2\b\u0010\f\u001a\u0004\u0018\u0001H\u000b2\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\u0014\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0016J\u001a\u0010\u0014\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\tH\u0016J\u001d\u0010\u0015\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u0001H\u000bH\u0016¢\u0006\u0002\u0010\rJ%\u0010\u0015\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u0001H\u000b2\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\u000eJ\u001c\u0010\u0016\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0016J$\u0010\u0016\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\b\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\u0018\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0016J$\u0010\u0018\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\b\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\u0019\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0016J$\u0010\u0019\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\b\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\u001a\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0016J$\u0010\u001a\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\b\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\tH\u0016J1\u0010\u0019\u001a\u00020\u0003\"\u000e\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\u001b2\b\u0010\u0010\u001a\u0004\u0018\u0001H\u000b2\b\u0010\u0017\u001a\u0004\u0018\u0001H\u000bH\u0016¢\u0006\u0002\u0010\u001cJ9\u0010\u0019\u001a\u00020\u0003\"\u000e\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\u001b2\b\u0010\u0010\u001a\u0004\u0018\u0001H\u000b2\b\u0010\u0017\u001a\u0004\u0018\u0001H\u000b2\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\u001dJ1\u0010\u001a\u001a\u00020\u0003\"\u000e\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\u001b2\b\u0010\u0010\u001a\u0004\u0018\u0001H\u000b2\b\u0010\u0017\u001a\u0004\u0018\u0001H\u000bH\u0016¢\u0006\u0002\u0010\u001cJ9\u0010\u001a\u001a\u00020\u0003\"\u000e\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\u001b2\b\u0010\u0010\u001a\u0004\u0018\u0001H\u000b2\b\u0010\u0017\u001a\u0004\u0018\u0001H\u000b2\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\u001dJ \u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J(\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\tH\u0016J \u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020 H\u0016J(\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\b\u001a\u00020\tH\u0016J-\u0010!\u001a\u00020\u0003\"\u000e\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\u001b2\u0006\u0010\u0010\u001a\u0002H\u000b2\u0006\u0010\u0017\u001a\u0002H\u000bH\u0016¢\u0006\u0002\u0010\u001cJ5\u0010!\u001a\u00020\u0003\"\u000e\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\u001b2\u0006\u0010\u0010\u001a\u0002H\u000b2\u0006\u0010\u0017\u001a\u0002H\u000b2\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\u001dJ-\u0010\"\u001a\u00020\u0003\"\u000e\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\u001b2\u0006\u0010\u0010\u001a\u0002H\u000b2\u0006\u0010\u0017\u001a\u0002H\u000bH\u0016¢\u0006\u0002\u0010\u001cJ5\u0010\"\u001a\u00020\u0003\"\u000e\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\u001b2\u0006\u0010\u0010\u001a\u0002H\u000b2\u0006\u0010\u0017\u001a\u0002H\u000b2\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\u001dJ-\u0010#\u001a\u00020\u0003\"\u000e\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\u001b2\u0006\u0010\u0010\u001a\u0002H\u000b2\u0006\u0010\u0017\u001a\u0002H\u000bH\u0016¢\u0006\u0002\u0010\u001cJ5\u0010#\u001a\u00020\u0003\"\u000e\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\u001b2\u0006\u0010\u0010\u001a\u0002H\u000b2\u0006\u0010\u0017\u001a\u0002H\u000b2\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\u001dJ-\u0010$\u001a\u00020\u0003\"\u000e\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\u001b2\u0006\u0010\u0010\u001a\u0002H\u000b2\u0006\u0010\u0017\u001a\u0002H\u000bH\u0016¢\u0006\u0002\u0010\u001cJ5\u0010$\u001a\u00020\u0003\"\u000e\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\u001b2\u0006\u0010\u0010\u001a\u0002H\u000b2\u0006\u0010\u0017\u001a\u0002H\u000b2\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\u001dJ \u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010%2\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010%H\u0016J.\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010%2\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010%2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0%H\u0016J\u0016\u0010\u0012\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110%H\u0016J$\u0010\u0012\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110%2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0%H\u0016J\u0016\u0010\u0013\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110%H\u0016J$\u0010\u0013\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110%2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0%H\u0016J\u0018\u0010\u0014\u001a\u00020\u00032\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010%H\u0016J&\u0010\u0014\u001a\u00020\u00032\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010%2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0%H\u0016J\u0018\u0010\u0015\u001a\u00020\u00032\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010%H\u0016J&\u0010\u0015\u001a\u00020\u00032\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010%2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0%H\u0016J(\u0010\u0016\u001a\u00020\u00032\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010%2\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010%H\u0016J6\u0010\u0016\u001a\u00020\u00032\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010%2\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010%2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0%H\u0016J(\u0010\u0018\u001a\u00020\u00032\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010%2\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010%H\u0016J6\u0010\u0018\u001a\u00020\u00032\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010%2\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010%2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0%H\u0016J(\u0010\u0019\u001a\u00020\u00032\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010%2\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010%H\u0016J6\u0010\u0019\u001a\u00020\u00032\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010%2\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010%2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0%H\u0016J(\u0010\u001a\u001a\u00020\u00032\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010%2\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010%H\u0016J6\u0010\u001a\u001a\u00020\u00032\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010%2\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010%2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0%H\u0016J\u0016\u0010&\u001a\u00020\u00032\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030%H\u0016¨\u0006(À\u0006\u0003"}, d2 = {"Lskip/unit/XCTestCase;", "", "beforeTest", "", "setUp", "afterTest", "tearDown", "XCTFail", ApiConstant.KEY_MSG, "", "XCTUnwrap", "T", "ob", "(Ljava/lang/Object;)Ljava/lang/Object;", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", "XCTAssert", "a", "", "XCTAssertTrue", "XCTAssertFalse", "XCTAssertNil", "XCTAssertNotNil", "XCTAssertIdentical", "b", "XCTAssertNotIdentical", "XCTAssertEqual", "XCTAssertNotEqual", "", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)V", "(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V", "", "accuracy", "", "XCTAssertGreaterThan", "XCTAssertGreaterThanOrEqual", "XCTAssertLessThan", "XCTAssertLessThanOrEqual", "Lkotlin/Function0;", "measure", "block", "SkipUnit"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface XCTestCase {
    private static Object XCTUnwrap$lambda$0(Function0 function0) {
        Object invoke = function0.invoke();
        ofn.d(invoke, null);
        return invoke;
    }

    private static Object XCTUnwrap$lambda$1(Function0 function0, Function0 function02) {
        Object invoke = function0.invoke();
        ofn.d(invoke, (String) function02.invoke());
        return invoke;
    }

    static /* synthetic */ Object a(Function0 function0, Function0 function02) {
        return XCTUnwrap$lambda$1(function0, function02);
    }

    static /* synthetic */ void access$XCTAssert$jd(XCTestCase xCTestCase, boolean z) {
        super.XCTAssert(z);
    }

    static /* synthetic */ void access$XCTAssertEqual$jd(XCTestCase xCTestCase, double d, double d2, double d3) {
        super.XCTAssertEqual(d, d2, d3);
    }

    static /* synthetic */ void access$XCTAssertFalse$jd(XCTestCase xCTestCase, Function0 function0) {
        super.XCTAssertFalse((Function0<Boolean>) function0);
    }

    static /* synthetic */ void access$XCTAssertGreaterThan$jd(XCTestCase xCTestCase, Comparable comparable, Comparable comparable2) {
        super.XCTAssertGreaterThan(comparable, comparable2);
    }

    static /* synthetic */ void access$XCTAssertGreaterThanOrEqual$jd(XCTestCase xCTestCase, Comparable comparable, Comparable comparable2) {
        super.XCTAssertGreaterThanOrEqual(comparable, comparable2);
    }

    static /* synthetic */ void access$XCTAssertIdentical$jd(XCTestCase xCTestCase, Object obj, Object obj2) {
        super.XCTAssertIdentical(obj, obj2);
    }

    static /* synthetic */ void access$XCTAssertLessThan$jd(XCTestCase xCTestCase, Comparable comparable, Comparable comparable2) {
        super.XCTAssertLessThan(comparable, comparable2);
    }

    static /* synthetic */ void access$XCTAssertLessThanOrEqual$jd(XCTestCase xCTestCase, Comparable comparable, Comparable comparable2) {
        super.XCTAssertLessThanOrEqual(comparable, comparable2);
    }

    static /* synthetic */ void access$XCTAssertNil$jd(XCTestCase xCTestCase, Object obj) {
        super.XCTAssertNil(obj);
    }

    static /* synthetic */ void access$XCTAssertNotEqual$jd(XCTestCase xCTestCase, Comparable comparable, Comparable comparable2) {
        super.XCTAssertNotEqual(comparable, comparable2);
    }

    static /* synthetic */ void access$XCTAssertNotIdentical$jd(XCTestCase xCTestCase, Object obj, Object obj2) {
        super.XCTAssertNotIdentical(obj, obj2);
    }

    static /* synthetic */ Object access$XCTAssertNotNil$jd(XCTestCase xCTestCase, Object obj) {
        return super.XCTAssertNotNil((XCTestCase) obj);
    }

    static /* synthetic */ void access$XCTAssertTrue$jd(XCTestCase xCTestCase, Function0 function0) {
        super.XCTAssertTrue((Function0<Boolean>) function0);
    }

    static /* synthetic */ void access$XCTFail$jd(XCTestCase xCTestCase) {
        super.XCTFail();
    }

    static /* synthetic */ Object access$XCTUnwrap$jd(XCTestCase xCTestCase, Object obj) {
        return super.XCTUnwrap((XCTestCase) obj);
    }

    static /* synthetic */ void access$afterTest$jd(XCTestCase xCTestCase) {
        super.afterTest();
    }

    static /* synthetic */ void access$beforeTest$jd(XCTestCase xCTestCase) {
        super.beforeTest();
    }

    static /* synthetic */ void access$measure$jd(XCTestCase xCTestCase, Function0 function0) {
        super.measure(function0);
    }

    static /* synthetic */ void access$setUp$jd(XCTestCase xCTestCase) {
        super.setUp();
    }

    static /* synthetic */ void access$tearDown$jd(XCTestCase xCTestCase) {
        super.tearDown();
    }

    static /* synthetic */ Object b(Function0 function0) {
        return XCTUnwrap$lambda$0(function0);
    }

    default void XCTAssert(boolean a, String msg) {
        msg.getClass();
        ofn.h(msg, a);
    }

    default void XCTAssertEqual(double a, double b, double accuracy, String msg) {
        msg.getClass();
        if (Double.compare(b, a) == 0 || Math.abs(b - a) <= accuracy) {
            return;
        }
        ofn.k(ofn.l(Double.valueOf(b), Double.valueOf(a), msg));
        throw null;
    }

    default void XCTAssertFalse(Function0<Boolean> a, Function0<String> msg) {
        a.getClass();
        msg.getClass();
        ofn.b(msg.invoke(), a.invoke().booleanValue());
    }

    default <T extends Comparable<? super T>> void XCTAssertGreaterThan(T a, T b) {
        boolean z;
        a.getClass();
        b.getClass();
        String str = a + " !> " + b;
        if (a.compareTo(b) > 0) {
            z = true;
        } else {
            z = false;
        }
        ofn.h(str, z);
    }

    default <T extends Comparable<? super T>> void XCTAssertGreaterThanOrEqual(T a, T b) {
        boolean z;
        a.getClass();
        b.getClass();
        String str = a + " !>= " + b;
        if (a.compareTo(b) >= 0) {
            z = true;
        } else {
            z = false;
        }
        ofn.h(str, z);
    }

    default void XCTAssertIdentical(Function0<? extends Object> a, Function0<? extends Object> b, Function0<String> msg) {
        a.getClass();
        b.getClass();
        msg.getClass();
        ofn.g(b.invoke(), a.invoke(), msg.invoke());
    }

    default <T extends Comparable<? super T>> void XCTAssertLessThan(T a, T b) {
        boolean z;
        a.getClass();
        b.getClass();
        String str = a + " !< " + b;
        if (a.compareTo(b) < 0) {
            z = true;
        } else {
            z = false;
        }
        ofn.h(str, z);
    }

    default <T extends Comparable<? super T>> void XCTAssertLessThanOrEqual(T a, T b) {
        boolean z;
        a.getClass();
        b.getClass();
        String str = a + " !<= " + b;
        if (a.compareTo(b) <= 0) {
            z = true;
        } else {
            z = false;
        }
        ofn.h(str, z);
    }

    default void XCTAssertNil(Function0<? extends Object> a, Function0<String> msg) {
        a.getClass();
        msg.getClass();
        ofn.f(a.invoke(), msg.invoke());
    }

    default <T extends Comparable<? super T>> void XCTAssertNotEqual(T a, T b) {
        ofn.b(a + " == " + b, Intrinsics.areEqual(a, b));
    }

    default void XCTAssertNotIdentical(Function0<? extends Object> a, Function0<? extends Object> b, Function0<String> msg) {
        a.getClass();
        b.getClass();
        msg.getClass();
        ofn.e(b.invoke(), a.invoke(), msg.invoke());
    }

    default void XCTAssertNotNil(Function0<? extends Object> a, Function0<String> msg) {
        a.getClass();
        msg.getClass();
        ofn.d(a.invoke(), msg.invoke());
    }

    default void XCTAssertTrue(Function0<Boolean> a, Function0<String> msg) {
        a.getClass();
        msg.getClass();
        ofn.h(msg.invoke(), a.invoke().booleanValue());
    }

    default void XCTFail(String msg) {
        msg.getClass();
        ofn.k(msg);
        throw null;
    }

    default <T> T XCTUnwrap(T ob, String msg) {
        msg.getClass();
        ofn.d(ob, msg);
        if (ob != null) {
            return ob;
        }
        f27.p();
        return null;
    }

    default void afterTest() {
        tearDown();
    }

    default void beforeTest() {
        setUp();
    }

    default void measure(Function0<Unit> block) {
        block.getClass();
        block.invoke();
    }

    static /* synthetic */ void access$XCTAssert$jd(XCTestCase xCTestCase, boolean z, String str) {
        super.XCTAssert(z, str);
    }

    static /* synthetic */ void access$XCTAssertEqual$jd(XCTestCase xCTestCase, double d, double d2, double d3, String str) {
        super.XCTAssertEqual(d, d2, d3, str);
    }

    static /* synthetic */ void access$XCTAssertFalse$jd(XCTestCase xCTestCase, Function0 function0, Function0 function02) {
        super.XCTAssertFalse((Function0<Boolean>) function0, (Function0<String>) function02);
    }

    static /* synthetic */ void access$XCTAssertGreaterThan$jd(XCTestCase xCTestCase, Comparable comparable, Comparable comparable2, String str) {
        super.XCTAssertGreaterThan(comparable, comparable2, str);
    }

    static /* synthetic */ void access$XCTAssertGreaterThanOrEqual$jd(XCTestCase xCTestCase, Comparable comparable, Comparable comparable2, String str) {
        super.XCTAssertGreaterThanOrEqual(comparable, comparable2, str);
    }

    static /* synthetic */ void access$XCTAssertIdentical$jd(XCTestCase xCTestCase, Object obj, Object obj2, String str) {
        super.XCTAssertIdentical(obj, obj2, str);
    }

    static /* synthetic */ void access$XCTAssertLessThan$jd(XCTestCase xCTestCase, Comparable comparable, Comparable comparable2, String str) {
        super.XCTAssertLessThan(comparable, comparable2, str);
    }

    static /* synthetic */ void access$XCTAssertLessThanOrEqual$jd(XCTestCase xCTestCase, Comparable comparable, Comparable comparable2, String str) {
        super.XCTAssertLessThanOrEqual(comparable, comparable2, str);
    }

    static /* synthetic */ void access$XCTAssertNil$jd(XCTestCase xCTestCase, Object obj, String str) {
        super.XCTAssertNil(obj, str);
    }

    static /* synthetic */ void access$XCTAssertNotEqual$jd(XCTestCase xCTestCase, Comparable comparable, Comparable comparable2, String str) {
        super.XCTAssertNotEqual(comparable, comparable2, str);
    }

    static /* synthetic */ void access$XCTAssertNotIdentical$jd(XCTestCase xCTestCase, Object obj, Object obj2, String str) {
        super.XCTAssertNotIdentical(obj, obj2, str);
    }

    static /* synthetic */ void access$XCTAssertTrue$jd(XCTestCase xCTestCase, Function0 function0, Function0 function02) {
        super.XCTAssertTrue((Function0<Boolean>) function0, (Function0<String>) function02);
    }

    static /* synthetic */ void access$XCTFail$jd(XCTestCase xCTestCase, String str) {
        super.XCTFail(str);
    }

    static /* synthetic */ void access$XCTAssertEqual$jd(XCTestCase xCTestCase, float f, float f2, float f3) {
        super.XCTAssertEqual(f, f2, f3);
    }

    static /* synthetic */ void access$XCTAssertFalse$jd(XCTestCase xCTestCase, boolean z) {
        super.XCTAssertFalse(z);
    }

    static /* synthetic */ void access$XCTAssertIdentical$jd(XCTestCase xCTestCase, Function0 function0, Function0 function02) {
        super.XCTAssertIdentical((Function0<? extends Object>) function0, (Function0<? extends Object>) function02);
    }

    static /* synthetic */ void access$XCTAssertNil$jd(XCTestCase xCTestCase, Function0 function0) {
        super.XCTAssertNil((Function0<? extends Object>) function0);
    }

    static /* synthetic */ void access$XCTAssertNotEqual$jd(XCTestCase xCTestCase, Object obj, Object obj2) {
        super.XCTAssertNotEqual(obj, obj2);
    }

    static /* synthetic */ void access$XCTAssertNotIdentical$jd(XCTestCase xCTestCase, Function0 function0, Function0 function02) {
        super.XCTAssertNotIdentical((Function0<? extends Object>) function0, (Function0<? extends Object>) function02);
    }

    static /* synthetic */ Object access$XCTAssertNotNil$jd(XCTestCase xCTestCase, Object obj, String str) {
        return super.XCTAssertNotNil((XCTestCase) obj, str);
    }

    static /* synthetic */ void access$XCTAssertTrue$jd(XCTestCase xCTestCase, boolean z) {
        super.XCTAssertTrue(z);
    }

    static /* synthetic */ Object access$XCTUnwrap$jd(XCTestCase xCTestCase, Object obj, String str) {
        return super.XCTUnwrap((XCTestCase) obj, str);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static void XCTAssert(XCTestCase xCTestCase, boolean z, String str) {
            str.getClass();
            XCTestCase.access$XCTAssert$jd(xCTestCase, z, str);
        }

        @Deprecated
        public static void XCTAssertEqual(XCTestCase xCTestCase, Function0<? extends Object> function0, Function0<? extends Object> function02, Function0<String> function03) {
            function0.getClass();
            function02.getClass();
            function03.getClass();
            XCTestCase.access$XCTAssertEqual$jd(xCTestCase, function0, function02, function03);
        }

        @Deprecated
        public static void XCTAssertFalse(XCTestCase xCTestCase, Function0<Boolean> function0, Function0<String> function02) {
            function0.getClass();
            function02.getClass();
            XCTestCase.access$XCTAssertFalse$jd(xCTestCase, function0, function02);
        }

        @Deprecated
        public static <T extends Comparable<? super T>> void XCTAssertGreaterThan(XCTestCase xCTestCase, T t, T t2, String str) {
            t.getClass();
            t2.getClass();
            str.getClass();
            XCTestCase.access$XCTAssertGreaterThan$jd(xCTestCase, t, t2, str);
        }

        @Deprecated
        public static <T extends Comparable<? super T>> void XCTAssertGreaterThanOrEqual(XCTestCase xCTestCase, T t, T t2, String str) {
            t.getClass();
            t2.getClass();
            str.getClass();
            XCTestCase.access$XCTAssertGreaterThanOrEqual$jd(xCTestCase, t, t2, str);
        }

        @Deprecated
        public static void XCTAssertIdentical(XCTestCase xCTestCase, Function0<? extends Object> function0, Function0<? extends Object> function02, Function0<String> function03) {
            function0.getClass();
            function02.getClass();
            function03.getClass();
            XCTestCase.access$XCTAssertIdentical$jd(xCTestCase, function0, function02, function03);
        }

        @Deprecated
        public static <T extends Comparable<? super T>> void XCTAssertLessThan(XCTestCase xCTestCase, T t, T t2, String str) {
            t.getClass();
            t2.getClass();
            str.getClass();
            XCTestCase.access$XCTAssertLessThan$jd(xCTestCase, t, t2, str);
        }

        @Deprecated
        public static <T extends Comparable<? super T>> void XCTAssertLessThanOrEqual(XCTestCase xCTestCase, T t, T t2, String str) {
            t.getClass();
            t2.getClass();
            str.getClass();
            XCTestCase.access$XCTAssertLessThanOrEqual$jd(xCTestCase, t, t2, str);
        }

        @Deprecated
        public static void XCTAssertNil(XCTestCase xCTestCase, Function0<? extends Object> function0, Function0<String> function02) {
            function0.getClass();
            function02.getClass();
            XCTestCase.access$XCTAssertNil$jd(xCTestCase, function0, function02);
        }

        @Deprecated
        public static void XCTAssertNotEqual(XCTestCase xCTestCase, Function0<? extends Object> function0, Function0<? extends Object> function02, Function0<String> function03) {
            function0.getClass();
            function02.getClass();
            function03.getClass();
            XCTestCase.access$XCTAssertNotEqual$jd(xCTestCase, function0, function02, function03);
        }

        @Deprecated
        public static void XCTAssertNotIdentical(XCTestCase xCTestCase, Function0<? extends Object> function0, Function0<? extends Object> function02, Function0<String> function03) {
            function0.getClass();
            function02.getClass();
            function03.getClass();
            XCTestCase.access$XCTAssertNotIdentical$jd(xCTestCase, function0, function02, function03);
        }

        @Deprecated
        public static void XCTAssertNotNil(XCTestCase xCTestCase, Function0<? extends Object> function0, Function0<String> function02) {
            function0.getClass();
            function02.getClass();
            XCTestCase.access$XCTAssertNotNil$jd(xCTestCase, function0, function02);
        }

        @Deprecated
        public static void XCTAssertTrue(XCTestCase xCTestCase, Function0<Boolean> function0, Function0<String> function02) {
            function0.getClass();
            function02.getClass();
            XCTestCase.access$XCTAssertTrue$jd(xCTestCase, function0, function02);
        }

        @Deprecated
        public static void XCTFail(XCTestCase xCTestCase, String str) {
            str.getClass();
            XCTestCase.access$XCTFail$jd(xCTestCase, str);
        }

        @Deprecated
        public static Function0<Object> XCTUnwrap(XCTestCase xCTestCase, Function0<? extends Object> function0, Function0<String> function02) {
            function0.getClass();
            function02.getClass();
            return XCTestCase.access$XCTUnwrap$jd(xCTestCase, function0, function02);
        }

        @Deprecated
        public static void afterTest(XCTestCase xCTestCase) {
            XCTestCase.access$afterTest$jd(xCTestCase);
        }

        @Deprecated
        public static void beforeTest(XCTestCase xCTestCase) {
            XCTestCase.access$beforeTest$jd(xCTestCase);
        }

        @Deprecated
        public static void measure(XCTestCase xCTestCase, Function0<Unit> function0) {
            function0.getClass();
            XCTestCase.access$measure$jd(xCTestCase, function0);
        }

        @Deprecated
        public static void setUp(XCTestCase xCTestCase) {
            XCTestCase.access$setUp$jd(xCTestCase);
        }

        @Deprecated
        public static void tearDown(XCTestCase xCTestCase) {
            XCTestCase.access$tearDown$jd(xCTestCase);
        }

        @Deprecated
        public static void XCTAssert(XCTestCase xCTestCase, boolean z) {
            XCTestCase.access$XCTAssert$jd(xCTestCase, z);
        }

        @Deprecated
        public static void XCTFail(XCTestCase xCTestCase) {
            XCTestCase.access$XCTFail$jd(xCTestCase);
        }

        @Deprecated
        public static void XCTAssertFalse(XCTestCase xCTestCase, boolean z, String str) {
            str.getClass();
            XCTestCase.access$XCTAssertFalse$jd(xCTestCase, z, str);
        }

        @Deprecated
        public static void XCTAssertNil(XCTestCase xCTestCase, Object obj, String str) {
            str.getClass();
            XCTestCase.access$XCTAssertNil$jd(xCTestCase, obj, str);
        }

        @Deprecated
        public static <T> T XCTAssertNotNil(XCTestCase xCTestCase, T t, String str) {
            str.getClass();
            return (T) XCTestCase.access$XCTAssertNotNil$jd(xCTestCase, t, str);
        }

        @Deprecated
        public static void XCTAssertTrue(XCTestCase xCTestCase, boolean z, String str) {
            str.getClass();
            XCTestCase.access$XCTAssertTrue$jd(xCTestCase, z, str);
        }

        @Deprecated
        public static void XCTAssertFalse(XCTestCase xCTestCase, Function0<Boolean> function0) {
            function0.getClass();
            XCTestCase.access$XCTAssertFalse$jd(xCTestCase, function0);
        }

        @Deprecated
        public static void XCTAssertNil(XCTestCase xCTestCase, Function0<? extends Object> function0) {
            function0.getClass();
            XCTestCase.access$XCTAssertNil$jd(xCTestCase, (Function0) function0);
        }

        @Deprecated
        public static void XCTAssertNotNil(XCTestCase xCTestCase, Function0<? extends Object> function0) {
            function0.getClass();
            XCTestCase.access$XCTAssertNotNil$jd(xCTestCase, (Function0) function0);
        }

        @Deprecated
        public static void XCTAssertTrue(XCTestCase xCTestCase, Function0<Boolean> function0) {
            function0.getClass();
            XCTestCase.access$XCTAssertTrue$jd(xCTestCase, function0);
        }

        @Deprecated
        public static <T> T XCTUnwrap(XCTestCase xCTestCase, T t, String str) {
            str.getClass();
            return (T) XCTestCase.access$XCTUnwrap$jd(xCTestCase, t, str);
        }

        @Deprecated
        public static void XCTAssertFalse(XCTestCase xCTestCase, boolean z) {
            XCTestCase.access$XCTAssertFalse$jd(xCTestCase, z);
        }

        @Deprecated
        public static void XCTAssertNil(XCTestCase xCTestCase, Object obj) {
            XCTestCase.access$XCTAssertNil$jd(xCTestCase, obj);
        }

        @Deprecated
        public static <T> T XCTAssertNotNil(XCTestCase xCTestCase, T t) {
            return (T) XCTestCase.access$XCTAssertNotNil$jd(xCTestCase, t);
        }

        @Deprecated
        public static void XCTAssertTrue(XCTestCase xCTestCase, boolean z) {
            XCTestCase.access$XCTAssertTrue$jd(xCTestCase, z);
        }

        @Deprecated
        public static Function0<Object> XCTUnwrap(XCTestCase xCTestCase, Function0<? extends Object> function0) {
            function0.getClass();
            return XCTestCase.access$XCTUnwrap$jd(xCTestCase, (Function0) function0);
        }

        @Deprecated
        public static void XCTAssertEqual(XCTestCase xCTestCase, Object obj, Object obj2, String str) {
            str.getClass();
            XCTestCase.access$XCTAssertEqual$jd(xCTestCase, obj, obj2, str);
        }

        @Deprecated
        public static <T extends Comparable<? super T>> void XCTAssertGreaterThan(XCTestCase xCTestCase, T t, T t2) {
            t.getClass();
            t2.getClass();
            XCTestCase.access$XCTAssertGreaterThan$jd(xCTestCase, t, t2);
        }

        @Deprecated
        public static <T extends Comparable<? super T>> void XCTAssertGreaterThanOrEqual(XCTestCase xCTestCase, T t, T t2) {
            t.getClass();
            t2.getClass();
            XCTestCase.access$XCTAssertGreaterThanOrEqual$jd(xCTestCase, t, t2);
        }

        @Deprecated
        public static void XCTAssertIdentical(XCTestCase xCTestCase, Object obj, Object obj2, String str) {
            str.getClass();
            XCTestCase.access$XCTAssertIdentical$jd(xCTestCase, obj, obj2, str);
        }

        @Deprecated
        public static <T extends Comparable<? super T>> void XCTAssertLessThan(XCTestCase xCTestCase, T t, T t2) {
            t.getClass();
            t2.getClass();
            XCTestCase.access$XCTAssertLessThan$jd(xCTestCase, t, t2);
        }

        @Deprecated
        public static <T extends Comparable<? super T>> void XCTAssertLessThanOrEqual(XCTestCase xCTestCase, T t, T t2) {
            t.getClass();
            t2.getClass();
            XCTestCase.access$XCTAssertLessThanOrEqual$jd(xCTestCase, t, t2);
        }

        @Deprecated
        public static void XCTAssertNotEqual(XCTestCase xCTestCase, Object obj, Object obj2, String str) {
            str.getClass();
            XCTestCase.access$XCTAssertNotEqual$jd(xCTestCase, obj, obj2, str);
        }

        @Deprecated
        public static void XCTAssertNotIdentical(XCTestCase xCTestCase, Object obj, Object obj2, String str) {
            str.getClass();
            XCTestCase.access$XCTAssertNotIdentical$jd(xCTestCase, obj, obj2, str);
        }

        @Deprecated
        public static <T> T XCTUnwrap(XCTestCase xCTestCase, T t) {
            return (T) XCTestCase.access$XCTUnwrap$jd(xCTestCase, t);
        }

        @Deprecated
        public static <T extends Comparable<? super T>> void XCTAssertEqual(XCTestCase xCTestCase, T t, T t2) {
            XCTestCase.access$XCTAssertEqual$jd(xCTestCase, (Comparable) t, (Comparable) t2);
        }

        @Deprecated
        public static void XCTAssertIdentical(XCTestCase xCTestCase, Function0<? extends Object> function0, Function0<? extends Object> function02) {
            function0.getClass();
            function02.getClass();
            XCTestCase.access$XCTAssertIdentical$jd(xCTestCase, (Function0) function0, (Function0) function02);
        }

        @Deprecated
        public static <T extends Comparable<? super T>> void XCTAssertNotEqual(XCTestCase xCTestCase, T t, T t2) {
            XCTestCase.access$XCTAssertNotEqual$jd(xCTestCase, (Comparable) t, (Comparable) t2);
        }

        @Deprecated
        public static void XCTAssertNotIdentical(XCTestCase xCTestCase, Function0<? extends Object> function0, Function0<? extends Object> function02) {
            function0.getClass();
            function02.getClass();
            XCTestCase.access$XCTAssertNotIdentical$jd(xCTestCase, (Function0) function0, (Function0) function02);
        }

        @Deprecated
        public static <T extends Comparable<? super T>> void XCTAssertEqual(XCTestCase xCTestCase, T t, T t2, String str) {
            str.getClass();
            XCTestCase.access$XCTAssertEqual$jd(xCTestCase, (Comparable) t, (Comparable) t2, str);
        }

        @Deprecated
        public static void XCTAssertIdentical(XCTestCase xCTestCase, Object obj, Object obj2) {
            XCTestCase.access$XCTAssertIdentical$jd(xCTestCase, obj, obj2);
        }

        @Deprecated
        public static <T extends Comparable<? super T>> void XCTAssertNotEqual(XCTestCase xCTestCase, T t, T t2, String str) {
            str.getClass();
            XCTestCase.access$XCTAssertNotEqual$jd(xCTestCase, (Comparable) t, (Comparable) t2, str);
        }

        @Deprecated
        public static void XCTAssertNotIdentical(XCTestCase xCTestCase, Object obj, Object obj2) {
            XCTestCase.access$XCTAssertNotIdentical$jd(xCTestCase, obj, obj2);
        }

        @Deprecated
        public static void XCTAssertEqual(XCTestCase xCTestCase, double d, double d2, double d3) {
            XCTestCase.access$XCTAssertEqual$jd(xCTestCase, d, d2, d3);
        }

        @Deprecated
        public static void XCTAssertNotEqual(XCTestCase xCTestCase, Function0<? extends Object> function0, Function0<? extends Object> function02) {
            function0.getClass();
            function02.getClass();
            XCTestCase.access$XCTAssertNotEqual$jd(xCTestCase, (Function0) function0, (Function0) function02);
        }

        @Deprecated
        public static void XCTAssertEqual(XCTestCase xCTestCase, double d, double d2, double d3, String str) {
            str.getClass();
            XCTestCase.access$XCTAssertEqual$jd(xCTestCase, d, d2, d3, str);
        }

        @Deprecated
        public static void XCTAssertNotEqual(XCTestCase xCTestCase, Object obj, Object obj2) {
            XCTestCase.access$XCTAssertNotEqual$jd(xCTestCase, obj, obj2);
        }

        @Deprecated
        public static void XCTAssertEqual(XCTestCase xCTestCase, float f, float f2, float f3) {
            XCTestCase.access$XCTAssertEqual$jd(xCTestCase, f, f2, f3);
        }

        @Deprecated
        public static void XCTAssertEqual(XCTestCase xCTestCase, float f, float f2, float f3, String str) {
            str.getClass();
            XCTestCase.access$XCTAssertEqual$jd(xCTestCase, f, f2, f3, str);
        }

        @Deprecated
        public static void XCTAssertEqual(XCTestCase xCTestCase, Function0<? extends Object> function0, Function0<? extends Object> function02) {
            function0.getClass();
            function02.getClass();
            XCTestCase.access$XCTAssertEqual$jd(xCTestCase, (Function0) function0, (Function0) function02);
        }

        @Deprecated
        public static void XCTAssertEqual(XCTestCase xCTestCase, Object obj, Object obj2) {
            XCTestCase.access$XCTAssertEqual$jd(xCTestCase, obj, obj2);
        }
    }

    static /* synthetic */ void access$XCTAssertEqual$jd(XCTestCase xCTestCase, float f, float f2, float f3, String str) {
        super.XCTAssertEqual(f, f2, f3, str);
    }

    static /* synthetic */ void access$XCTAssertFalse$jd(XCTestCase xCTestCase, boolean z, String str) {
        super.XCTAssertFalse(z, str);
    }

    static /* synthetic */ void access$XCTAssertIdentical$jd(XCTestCase xCTestCase, Function0 function0, Function0 function02, Function0 function03) {
        super.XCTAssertIdentical((Function0<? extends Object>) function0, (Function0<? extends Object>) function02, (Function0<String>) function03);
    }

    static /* synthetic */ void access$XCTAssertNil$jd(XCTestCase xCTestCase, Function0 function0, Function0 function02) {
        super.XCTAssertNil((Function0<? extends Object>) function0, (Function0<String>) function02);
    }

    static /* synthetic */ void access$XCTAssertNotEqual$jd(XCTestCase xCTestCase, Object obj, Object obj2, String str) {
        super.XCTAssertNotEqual(obj, obj2, str);
    }

    static /* synthetic */ void access$XCTAssertNotIdentical$jd(XCTestCase xCTestCase, Function0 function0, Function0 function02, Function0 function03) {
        super.XCTAssertNotIdentical((Function0<? extends Object>) function0, (Function0<? extends Object>) function02, (Function0<String>) function03);
    }

    static /* synthetic */ void access$XCTAssertNotNil$jd(XCTestCase xCTestCase, Function0 function0) {
        super.XCTAssertNotNil((Function0<? extends Object>) function0);
    }

    static /* synthetic */ void access$XCTAssertTrue$jd(XCTestCase xCTestCase, boolean z, String str) {
        super.XCTAssertTrue(z, str);
    }

    static /* synthetic */ Function0 access$XCTUnwrap$jd(XCTestCase xCTestCase, Function0 function0) {
        return super.XCTUnwrap((Function0<? extends Object>) function0);
    }

    static /* synthetic */ void access$XCTAssertEqual$jd(XCTestCase xCTestCase, Comparable comparable, Comparable comparable2) {
        super.XCTAssertEqual(comparable, comparable2);
    }

    static /* synthetic */ void access$XCTAssertNotEqual$jd(XCTestCase xCTestCase, Function0 function0, Function0 function02) {
        super.XCTAssertNotEqual((Function0<? extends Object>) function0, (Function0<? extends Object>) function02);
    }

    static /* synthetic */ void access$XCTAssertNotNil$jd(XCTestCase xCTestCase, Function0 function0, Function0 function02) {
        super.XCTAssertNotNil((Function0<? extends Object>) function0, (Function0<String>) function02);
    }

    static /* synthetic */ Function0 access$XCTUnwrap$jd(XCTestCase xCTestCase, Function0 function0, Function0 function02) {
        return super.XCTUnwrap((Function0<? extends Object>) function0, (Function0<String>) function02);
    }

    default void XCTAssert(boolean a) {
        ofn.h(null, a);
    }

    static /* synthetic */ void access$XCTAssertEqual$jd(XCTestCase xCTestCase, Comparable comparable, Comparable comparable2, String str) {
        super.XCTAssertEqual(comparable, comparable2, str);
    }

    static /* synthetic */ void access$XCTAssertNotEqual$jd(XCTestCase xCTestCase, Function0 function0, Function0 function02, Function0 function03) {
        super.XCTAssertNotEqual((Function0<? extends Object>) function0, (Function0<? extends Object>) function02, (Function0<String>) function03);
    }

    default void XCTFail() {
        ofn.k(null);
        throw null;
    }

    static /* synthetic */ void access$XCTAssertEqual$jd(XCTestCase xCTestCase, Object obj, Object obj2) {
        super.XCTAssertEqual(obj, obj2);
    }

    static /* synthetic */ void access$XCTAssertEqual$jd(XCTestCase xCTestCase, Object obj, Object obj2, String str) {
        super.XCTAssertEqual(obj, obj2, str);
    }

    static /* synthetic */ void access$XCTAssertEqual$jd(XCTestCase xCTestCase, Function0 function0, Function0 function02) {
        super.XCTAssertEqual((Function0<? extends Object>) function0, (Function0<? extends Object>) function02);
    }

    static /* synthetic */ void access$XCTAssertEqual$jd(XCTestCase xCTestCase, Function0 function0, Function0 function02, Function0 function03) {
        super.XCTAssertEqual((Function0<? extends Object>) function0, (Function0<? extends Object>) function02, (Function0<String>) function03);
    }

    default Function0<Object> XCTUnwrap(Function0<? extends Object> ob) {
        ob.getClass();
        return new v9j(ob, 14);
    }

    default void setUp() {
    }

    default void tearDown() {
    }

    default Function0<Object> XCTUnwrap(Function0<? extends Object> ob, Function0<String> msg) {
        ob.getClass();
        msg.getClass();
        return new ls3(ob, msg, 4);
    }

    default <T> T XCTUnwrap(T ob) {
        ofn.d(ob, null);
        if (ob != null) {
            return ob;
        }
        f27.p();
        return null;
    }

    default void XCTAssertNil(Function0<? extends Object> a) {
        a.getClass();
        ofn.f(a.invoke(), null);
    }

    default void XCTAssertNotNil(Function0<? extends Object> a) {
        a.getClass();
        ofn.d(a.invoke(), null);
    }

    default void XCTAssertNil(Object a, String msg) {
        msg.getClass();
        ofn.f(a, msg);
    }

    default <T> T XCTAssertNotNil(T a, String msg) {
        msg.getClass();
        ofn.d(a, msg);
        a.getClass();
        return a;
    }

    default void XCTAssertNil(Object a) {
        ofn.f(a, null);
    }

    default <T> T XCTAssertNotNil(T a) {
        ofn.d(a, null);
        a.getClass();
        return a;
    }

    default void XCTAssertFalse(boolean a) {
        ofn.b(null, a);
    }

    default void XCTAssertTrue(boolean a) {
        ofn.h(null, a);
    }

    default void XCTAssertFalse(Function0<Boolean> a) {
        a.getClass();
        ofn.b(null, a.invoke().booleanValue());
    }

    default void XCTAssertIdentical(Function0<? extends Object> a, Function0<? extends Object> b) {
        a.getClass();
        b.getClass();
        ofn.g(b.invoke(), a.invoke(), null);
    }

    default void XCTAssertNotIdentical(Function0<? extends Object> a, Function0<? extends Object> b) {
        a.getClass();
        b.getClass();
        ofn.e(b.invoke(), a.invoke(), null);
    }

    default void XCTAssertTrue(Function0<Boolean> a) {
        a.getClass();
        ofn.h(null, a.invoke().booleanValue());
    }

    default void XCTAssertNotEqual(Object a, Object b, String msg) {
        msg.getClass();
        ofn.c(b, a, msg);
    }

    default void XCTAssertFalse(boolean a, String msg) {
        msg.getClass();
        ofn.b(msg, a);
    }

    default void XCTAssertIdentical(Object a, Object b, String msg) {
        msg.getClass();
        ofn.g(b, a, msg);
    }

    default <T extends Comparable<? super T>> void XCTAssertNotEqual(T a, T b, String msg) {
        msg.getClass();
        ofn.b(msg, Intrinsics.areEqual(a, b));
    }

    default void XCTAssertNotIdentical(Object a, Object b, String msg) {
        msg.getClass();
        ofn.e(b, a, msg);
    }

    default void XCTAssertTrue(boolean a, String msg) {
        msg.getClass();
        ofn.h(msg, a);
    }

    default void XCTAssertIdentical(Object a, Object b) {
        ofn.g(b, a, null);
    }

    default void XCTAssertNotEqual(Function0<? extends Object> a, Function0<? extends Object> b) {
        a.getClass();
        b.getClass();
        ofn.c(b.invoke(), a.invoke(), null);
    }

    default void XCTAssertNotIdentical(Object a, Object b) {
        ofn.e(b, a, null);
    }

    default void XCTAssertNotEqual(Function0<? extends Object> a, Function0<? extends Object> b, Function0<String> msg) {
        a.getClass();
        b.getClass();
        msg.getClass();
        ofn.c(b.invoke(), a.invoke(), msg.invoke());
    }

    default void XCTAssertNotEqual(Object a, Object b) {
        ofn.c(b, a, null);
    }

    default <T extends Comparable<? super T>> void XCTAssertEqual(T a, T b) {
        ofn.h(a + " != " + b, Intrinsics.areEqual(a, b));
    }

    default <T extends Comparable<? super T>> void XCTAssertEqual(T a, T b, String msg) {
        msg.getClass();
        ofn.h(msg, Intrinsics.areEqual(a, b));
    }

    default <T extends Comparable<? super T>> void XCTAssertGreaterThan(T a, T b, String msg) {
        a.getClass();
        b.getClass();
        msg.getClass();
        ofn.h(msg, a.compareTo(b) > 0);
    }

    default <T extends Comparable<? super T>> void XCTAssertGreaterThanOrEqual(T a, T b, String msg) {
        a.getClass();
        b.getClass();
        msg.getClass();
        ofn.h(msg, a.compareTo(b) >= 0);
    }

    default <T extends Comparable<? super T>> void XCTAssertLessThan(T a, T b, String msg) {
        a.getClass();
        b.getClass();
        msg.getClass();
        ofn.h(msg, a.compareTo(b) < 0);
    }

    default <T extends Comparable<? super T>> void XCTAssertLessThanOrEqual(T a, T b, String msg) {
        a.getClass();
        b.getClass();
        msg.getClass();
        ofn.h(msg, a.compareTo(b) <= 0);
    }

    default void XCTAssertEqual(Function0<? extends Object> a, Function0<? extends Object> b) {
        a.getClass();
        b.getClass();
        ofn.a(b.invoke(), a.invoke(), null);
    }

    default void XCTAssertEqual(Function0<? extends Object> a, Function0<? extends Object> b, Function0<String> msg) {
        a.getClass();
        b.getClass();
        msg.getClass();
        ofn.a(b.invoke(), a.invoke(), msg.invoke());
    }

    default void XCTAssertEqual(Object a, Object b) {
        ofn.a(b, a, null);
    }

    default void XCTAssertEqual(double a, double b, double accuracy) {
        if (Double.compare(b, a) != 0 && Math.abs(b - a) > accuracy) {
            ofn.k(ofn.l(Double.valueOf(b), Double.valueOf(a), null));
            throw null;
        }
    }

    default void XCTAssertEqual(Object a, Object b, String msg) {
        msg.getClass();
        ofn.a(b, a, a + " is not equal to " + b + " – " + msg);
    }

    default void XCTAssertEqual(float a, float b, float accuracy) {
        if (Float.compare(b, a) != 0 && Math.abs(b - a) > accuracy) {
            ofn.k(ofn.l(Float.valueOf(b), Float.valueOf(a), null));
            throw null;
        }
    }

    default void XCTAssertEqual(float a, float b, float accuracy, String msg) {
        msg.getClass();
        if (Float.compare(b, a) != 0 && Math.abs(b - a) > accuracy) {
            ofn.k(ofn.l(Float.valueOf(b), Float.valueOf(a), msg));
            throw null;
        }
    }
}
