/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fir.components;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link GenerateNewCompilerTests.kt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/analysisSession/resolveCall")
@TestDataPath("$PROJECT_ROOT")
public class ResolveCallTestGenerated extends AbstractResolveCallTest {
    @Test
    public void testAllFilesPresentInResolveCall() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/analysisSession/resolveCall"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("delegatedConstructorCall_super.kt")
    public void testDelegatedConstructorCall_super() throws Exception {
        runTest("analysis/analysis-api/testData/analysisSession/resolveCall/delegatedConstructorCall_super.kt");
    }

    @Test
    @TestMetadata("delegatedConstructorCall_super_unresolved.kt")
    public void testDelegatedConstructorCall_super_unresolved() throws Exception {
        runTest("analysis/analysis-api/testData/analysisSession/resolveCall/delegatedConstructorCall_super_unresolved.kt");
    }

    @Test
    @TestMetadata("delegatedConstructorCall_this.kt")
    public void testDelegatedConstructorCall_this() throws Exception {
        runTest("analysis/analysis-api/testData/analysisSession/resolveCall/delegatedConstructorCall_this.kt");
    }

    @Test
    @TestMetadata("delegatedConstructorCall_this_unresolved.kt")
    public void testDelegatedConstructorCall_this_unresolved() throws Exception {
        runTest("analysis/analysis-api/testData/analysisSession/resolveCall/delegatedConstructorCall_this_unresolved.kt");
    }

    @Test
    @TestMetadata("functionCallInTheSameFile.kt")
    public void testFunctionCallInTheSameFile() throws Exception {
        runTest("analysis/analysis-api/testData/analysisSession/resolveCall/functionCallInTheSameFile.kt");
    }

    @Test
    @TestMetadata("functionCallWithLambdaArgument.kt")
    public void testFunctionCallWithLambdaArgument() throws Exception {
        runTest("analysis/analysis-api/testData/analysisSession/resolveCall/functionCallWithLambdaArgument.kt");
    }

    @Test
    @TestMetadata("functionCallWithNamedArgument.kt")
    public void testFunctionCallWithNamedArgument() throws Exception {
        runTest("analysis/analysis-api/testData/analysisSession/resolveCall/functionCallWithNamedArgument.kt");
    }

    @Test
    @TestMetadata("functionCallWithNonTrailingLambdaArgument.kt")
    public void testFunctionCallWithNonTrailingLambdaArgument() throws Exception {
        runTest("analysis/analysis-api/testData/analysisSession/resolveCall/functionCallWithNonTrailingLambdaArgument.kt");
    }

    @Test
    @TestMetadata("functionCallWithSpreadArgument.kt")
    public void testFunctionCallWithSpreadArgument() throws Exception {
        runTest("analysis/analysis-api/testData/analysisSession/resolveCall/functionCallWithSpreadArgument.kt");
    }

    @Test
    @TestMetadata("functionCallWithVarargArgument.kt")
    public void testFunctionCallWithVarargArgument() throws Exception {
        runTest("analysis/analysis-api/testData/analysisSession/resolveCall/functionCallWithVarargArgument.kt");
    }

    @Test
    @TestMetadata("functionWithReceiverCall.kt")
    public void testFunctionWithReceiverCall() throws Exception {
        runTest("analysis/analysis-api/testData/analysisSession/resolveCall/functionWithReceiverCall.kt");
    }

    @Test
    @TestMetadata("functionWithReceiverSafeCall.kt")
    public void testFunctionWithReceiverSafeCall() throws Exception {
        runTest("analysis/analysis-api/testData/analysisSession/resolveCall/functionWithReceiverSafeCall.kt");
    }

    @Test
    @TestMetadata("implicitConstructorDelegationCall.kt")
    public void testImplicitConstructorDelegationCall() throws Exception {
        runTest("analysis/analysis-api/testData/analysisSession/resolveCall/implicitConstructorDelegationCall.kt");
    }

    @Test
    @TestMetadata("implicitConstuctorCall.kt")
    public void testImplicitConstuctorCall() throws Exception {
        runTest("analysis/analysis-api/testData/analysisSession/resolveCall/implicitConstuctorCall.kt");
    }

    @Test
    @TestMetadata("implicitJavaConstuctorCall.kt")
    public void testImplicitJavaConstuctorCall() throws Exception {
        runTest("analysis/analysis-api/testData/analysisSession/resolveCall/implicitJavaConstuctorCall.kt");
    }

    @Test
    @TestMetadata("indexedGet.kt")
    public void testIndexedGet() throws Exception {
        runTest("analysis/analysis-api/testData/analysisSession/resolveCall/indexedGet.kt");
    }

    @Test
    @TestMetadata("indexedGetWithNotEnoughArgs.kt")
    public void testIndexedGetWithNotEnoughArgs() throws Exception {
        runTest("analysis/analysis-api/testData/analysisSession/resolveCall/indexedGetWithNotEnoughArgs.kt");
    }

    @Test
    @TestMetadata("indexedGetWithTooManyArgs.kt")
    public void testIndexedGetWithTooManyArgs() throws Exception {
        runTest("analysis/analysis-api/testData/analysisSession/resolveCall/indexedGetWithTooManyArgs.kt");
    }

    @Test
    @TestMetadata("indexedSet.kt")
    public void testIndexedSet() throws Exception {
        runTest("analysis/analysis-api/testData/analysisSession/resolveCall/indexedSet.kt");
    }

    @Test
    @TestMetadata("indexedSetWithNotEnoughArgs.kt")
    public void testIndexedSetWithNotEnoughArgs() throws Exception {
        runTest("analysis/analysis-api/testData/analysisSession/resolveCall/indexedSetWithNotEnoughArgs.kt");
    }

    @Test
    @TestMetadata("indexedSetWithTooManyArgs.kt")
    public void testIndexedSetWithTooManyArgs() throws Exception {
        runTest("analysis/analysis-api/testData/analysisSession/resolveCall/indexedSetWithTooManyArgs.kt");
    }

    @Test
    @TestMetadata("javaFunctionCall.kt")
    public void testJavaFunctionCall() throws Exception {
        runTest("analysis/analysis-api/testData/analysisSession/resolveCall/javaFunctionCall.kt");
    }

    @Test
    @TestMetadata("javaPropertyGetter.kt")
    public void testJavaPropertyGetter() throws Exception {
        runTest("analysis/analysis-api/testData/analysisSession/resolveCall/javaPropertyGetter.kt");
    }

    @Test
    @TestMetadata("javaPropertyNestedGetter.kt")
    public void testJavaPropertyNestedGetter() throws Exception {
        runTest("analysis/analysis-api/testData/analysisSession/resolveCall/javaPropertyNestedGetter.kt");
    }

    @Test
    @TestMetadata("javaPropertySetter.kt")
    public void testJavaPropertySetter() throws Exception {
        runTest("analysis/analysis-api/testData/analysisSession/resolveCall/javaPropertySetter.kt");
    }

    @Test
    @TestMetadata("javaPropertySetterIncomplete.kt")
    public void testJavaPropertySetterIncomplete() throws Exception {
        runTest("analysis/analysis-api/testData/analysisSession/resolveCall/javaPropertySetterIncomplete.kt");
    }

    @Test
    @TestMetadata("kotlinPropertyGetter.kt")
    public void testKotlinPropertyGetter() throws Exception {
        runTest("analysis/analysis-api/testData/analysisSession/resolveCall/kotlinPropertyGetter.kt");
    }

    @Test
    @TestMetadata("kotlinPropertyNestedGetter.kt")
    public void testKotlinPropertyNestedGetter() throws Exception {
        runTest("analysis/analysis-api/testData/analysisSession/resolveCall/kotlinPropertyNestedGetter.kt");
    }

    @Test
    @TestMetadata("kotlinPropertySetter.kt")
    public void testKotlinPropertySetter() throws Exception {
        runTest("analysis/analysis-api/testData/analysisSession/resolveCall/kotlinPropertySetter.kt");
    }

    @Test
    @TestMetadata("resolveCallInSuperConstructorParam.kt")
    public void testResolveCallInSuperConstructorParam() throws Exception {
        runTest("analysis/analysis-api/testData/analysisSession/resolveCall/resolveCallInSuperConstructorParam.kt");
    }

    @Test
    @TestMetadata("simpleCallWithNonMatchingArgs.kt")
    public void testSimpleCallWithNonMatchingArgs() throws Exception {
        runTest("analysis/analysis-api/testData/analysisSession/resolveCall/simpleCallWithNonMatchingArgs.kt");
    }

    @Test
    @TestMetadata("unresolvedSuperReference.kt")
    public void testUnresolvedSuperReference() throws Exception {
        runTest("analysis/analysis-api/testData/analysisSession/resolveCall/unresolvedSuperReference.kt");
    }

    @Test
    @TestMetadata("variableAsFunction.kt")
    public void testVariableAsFunction() throws Exception {
        runTest("analysis/analysis-api/testData/analysisSession/resolveCall/variableAsFunction.kt");
    }

    @Test
    @TestMetadata("variableAsFunctionLikeCall.kt")
    public void testVariableAsFunctionLikeCall() throws Exception {
        runTest("analysis/analysis-api/testData/analysisSession/resolveCall/variableAsFunctionLikeCall.kt");
    }
}
