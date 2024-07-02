/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir.analysis.diagnostics

/*
 * This file was generated automatically
 * DO NOT MODIFY IT MANUALLY
 */

val FIR_NON_SUPPRESSIBLE_ERROR_NAMES: Set<String> = setOf(
    "UNSUPPORTED",
    "UNSUPPORTED_FEATURE",
    "UNSUPPORTED_SUSPEND_TEST",
    "NEW_INFERENCE_ERROR",
    "OTHER_ERROR",
    "OTHER_ERROR_WITH_REASON",
    "ILLEGAL_CONST_EXPRESSION",
    "ILLEGAL_UNDERSCORE",
    "EXPRESSION_EXPECTED",
    "ASSIGNMENT_IN_EXPRESSION_CONTEXT",
    "BREAK_OR_CONTINUE_OUTSIDE_A_LOOP",
    "NOT_A_LOOP_LABEL",
    "BREAK_OR_CONTINUE_JUMPS_ACROSS_FUNCTION_BOUNDARY",
    "VARIABLE_EXPECTED",
    "DELEGATION_IN_INTERFACE",
    "DELEGATION_NOT_TO_INTERFACE",
    "NESTED_CLASS_NOT_ALLOWED",
    "INCORRECT_CHARACTER_LITERAL",
    "EMPTY_CHARACTER_LITERAL",
    "TOO_MANY_CHARACTERS_IN_CHARACTER_LITERAL",
    "ILLEGAL_ESCAPE",
    "INT_LITERAL_OUT_OF_RANGE",
    "FLOAT_LITERAL_OUT_OF_RANGE",
    "WRONG_LONG_SUFFIX",
    "UNSIGNED_LITERAL_WITHOUT_DECLARATIONS_ON_CLASSPATH",
    "VAL_OR_VAR_ON_LOOP_PARAMETER",
    "VAL_OR_VAR_ON_FUN_PARAMETER",
    "VAL_OR_VAR_ON_CATCH_PARAMETER",
    "VAL_OR_VAR_ON_SECONDARY_CONSTRUCTOR_PARAMETER",
    "INVISIBLE_SETTER",
    "MISSING_CONSTRUCTOR_KEYWORD",
    "INVISIBLE_REFERENCE",
    "UNRESOLVED_REFERENCE",
    "UNRESOLVED_LABEL",
    "AMBIGUOUS_LABEL",
    "DESERIALIZATION_ERROR",
    "ERROR_FROM_JAVA_RESOLUTION",
    "MISSING_STDLIB_CLASS",
    "NO_THIS",
    "VERSION_REQUIREMENT_DEPRECATION_ERROR",
    "API_NOT_AVAILABLE",
    "UNRESOLVED_REFERENCE_WRONG_RECEIVER",
    "UNRESOLVED_IMPORT",
    "DUPLICATE_PARAMETER_NAME_IN_FUNCTION_TYPE",
    "MISSING_DEPENDENCY_CLASS",
    "MISSING_DEPENDENCY_SUPERCLASS",
    "CREATING_AN_INSTANCE_OF_ABSTRACT_CLASS",
    "NO_CONSTRUCTOR",
    "FUNCTION_CALL_EXPECTED",
    "ILLEGAL_SELECTOR",
    "NO_RECEIVER_ALLOWED",
    "FUNCTION_EXPECTED",
    "INTERFACE_AS_FUNCTION",
    "EXPECT_CLASS_AS_FUNCTION",
    "INNER_CLASS_CONSTRUCTOR_NO_RECEIVER",
    "PLUGIN_AMBIGUOUS_INTERCEPTED_SYMBOL",
    "RESOLUTION_TO_CLASSIFIER",
    "AMBIGUOUS_ALTERED_ASSIGN",
    "FORBIDDEN_BINARY_MOD",
    "DEPRECATED_BINARY_MOD",
    "SELF_CALL_IN_NESTED_OBJECT_CONSTRUCTOR_ERROR",
    "SUPER_IS_NOT_AN_EXPRESSION",
    "SUPER_NOT_AVAILABLE",
    "ABSTRACT_SUPER_CALL",
    "INSTANCE_ACCESS_BEFORE_SUPER_CALL",
    "SUPER_CALL_WITH_DEFAULT_PARAMETERS",
    "INTERFACE_CANT_CALL_DEFAULT_METHOD_VIA_SUPER",
    "NOT_A_SUPERTYPE",
    "SUPERCLASS_NOT_ACCESSIBLE_FROM_INTERFACE",
    "QUALIFIED_SUPERTYPE_EXTENDED_BY_OTHER_SUPERTYPE",
    "SUPERTYPE_INITIALIZED_IN_INTERFACE",
    "INTERFACE_WITH_SUPERCLASS",
    "FINAL_SUPERTYPE",
    "CLASS_CANNOT_BE_EXTENDED_DIRECTLY",
    "SUPERTYPE_IS_EXTENSION_FUNCTION_TYPE",
    "SINGLETON_IN_SUPERTYPE",
    "NULLABLE_SUPERTYPE",
    "MANY_CLASSES_IN_SUPERTYPE_LIST",
    "SUPERTYPE_APPEARS_TWICE",
    "CLASS_IN_SUPERTYPE_FOR_ENUM",
    "SEALED_SUPERTYPE",
    "SEALED_SUPERTYPE_IN_LOCAL_CLASS",
    "SEALED_INHERITOR_IN_DIFFERENT_PACKAGE",
    "SEALED_INHERITOR_IN_DIFFERENT_MODULE",
    "CLASS_INHERITS_JAVA_SEALED_CLASS",
    "UNSUPPORTED_SEALED_FUN_INTERFACE",
    "SUPERTYPE_NOT_A_CLASS_OR_INTERFACE",
    "UNSUPPORTED_INHERITANCE_FROM_JAVA_MEMBER_REFERENCING_KOTLIN_FUNCTION",
    "CYCLIC_INHERITANCE_HIERARCHY",
    "PROJECTION_IN_IMMEDIATE_ARGUMENT_TO_SUPERTYPE",
    "INCONSISTENT_TYPE_PARAMETER_VALUES",
    "INCONSISTENT_TYPE_PARAMETER_BOUNDS",
    "AMBIGUOUS_SUPER",
    "WRONG_MULTIPLE_INHERITANCE",
    "CONSTRUCTOR_IN_OBJECT",
    "CONSTRUCTOR_IN_INTERFACE",
    "NON_PRIVATE_CONSTRUCTOR_IN_ENUM",
    "NON_PRIVATE_OR_PROTECTED_CONSTRUCTOR_IN_SEALED",
    "CYCLIC_CONSTRUCTOR_DELEGATION_CALL",
    "PRIMARY_CONSTRUCTOR_DELEGATION_CALL_EXPECTED",
    "PROTECTED_CONSTRUCTOR_NOT_IN_SUPER_CALL",
    "SUPERTYPE_NOT_INITIALIZED",
    "SUPERTYPE_INITIALIZED_WITHOUT_PRIMARY_CONSTRUCTOR",
    "DELEGATION_SUPER_CALL_IN_ENUM_CONSTRUCTOR",
    "EXPLICIT_DELEGATION_CALL_REQUIRED",
    "SEALED_CLASS_CONSTRUCTOR_CALL",
    "DATA_CLASS_CONSISTENT_COPY_AND_EXPOSED_COPY_ARE_INCOMPATIBLE_ANNOTATIONS",
    "DATA_CLASS_CONSISTENT_COPY_WRONG_ANNOTATION_TARGET",
    "DATA_CLASS_WITHOUT_PARAMETERS",
    "DATA_CLASS_VARARG_PARAMETER",
    "DATA_CLASS_NOT_PROPERTY_PARAMETER",
    "ANNOTATION_ARGUMENT_KCLASS_LITERAL_OF_TYPE_PARAMETER_ERROR",
    "ANNOTATION_ARGUMENT_MUST_BE_CONST",
    "ANNOTATION_ARGUMENT_MUST_BE_ENUM_CONST",
    "ANNOTATION_ARGUMENT_MUST_BE_KCLASS_LITERAL",
    "ANNOTATION_CLASS_MEMBER",
    "ANNOTATION_PARAMETER_DEFAULT_VALUE_MUST_BE_CONSTANT",
    "INVALID_TYPE_OF_ANNOTATION_MEMBER",
    "LOCAL_ANNOTATION_CLASS_ERROR",
    "MISSING_VAL_ON_ANNOTATION_PARAMETER",
    "NON_CONST_VAL_USED_IN_CONSTANT_EXPRESSION",
    "ANNOTATION_CLASS_CONSTRUCTOR_CALL",
    "ENUM_CLASS_CONSTRUCTOR_CALL",
    "NOT_AN_ANNOTATION_CLASS",
    "NULLABLE_TYPE_OF_ANNOTATION_MEMBER",
    "VAR_ANNOTATION_PARAMETER",
    "SUPERTYPES_FOR_ANNOTATION_CLASS",
    "ANNOTATION_USED_AS_ANNOTATION_ARGUMENT",
    "ILLEGAL_KOTLIN_VERSION_STRING_VALUE",
    "DEPRECATED_SINCE_KOTLIN_WITH_UNORDERED_VERSIONS",
    "DEPRECATED_SINCE_KOTLIN_WITHOUT_ARGUMENTS",
    "DEPRECATED_SINCE_KOTLIN_WITHOUT_DEPRECATED",
    "DEPRECATED_SINCE_KOTLIN_WITH_DEPRECATED_LEVEL",
    "DEPRECATED_SINCE_KOTLIN_OUTSIDE_KOTLIN_SUBPACKAGE",
    "WRONG_ANNOTATION_TARGET",
    "WRONG_ANNOTATION_TARGET_WITH_USE_SITE_TARGET",
    "INAPPLICABLE_TARGET_ON_PROPERTY",
    "INAPPLICABLE_TARGET_PROPERTY_IMMUTABLE",
    "INAPPLICABLE_TARGET_PROPERTY_HAS_NO_DELEGATE",
    "INAPPLICABLE_TARGET_PROPERTY_HAS_NO_BACKING_FIELD",
    "INAPPLICABLE_PARAM_TARGET",
    "INAPPLICABLE_FILE_TARGET",
    "REPEATED_ANNOTATION",
    "NOT_A_CLASS",
    "WRONG_EXTENSION_FUNCTION_TYPE",
    "ANNOTATION_IN_WHERE_CLAUSE_ERROR",
    "COMPILER_REQUIRED_ANNOTATION_AMBIGUITY",
    "AMBIGUOUS_ANNOTATION_ARGUMENT",
    "VOLATILE_ON_VALUE",
    "VOLATILE_ON_DELEGATE",
    "NON_SOURCE_ANNOTATION_ON_INLINED_LAMBDA_EXPRESSION",
    "JS_MODULE_PROHIBITED_ON_VAR",
    "JS_MODULE_PROHIBITED_ON_NON_NATIVE",
    "NESTED_JS_MODULE_PROHIBITED",
    "CALL_FROM_UMD_MUST_BE_JS_MODULE_AND_JS_NON_MODULE",
    "CALL_TO_JS_MODULE_WITHOUT_MODULE_SYSTEM",
    "CALL_TO_JS_NON_MODULE_WITH_MODULE_SYSTEM",
    "RUNTIME_ANNOTATION_ON_EXTERNAL_DECLARATION",
    "NATIVE_ANNOTATIONS_ALLOWED_ONLY_ON_MEMBER_OR_EXTENSION_FUN",
    "NATIVE_INDEXER_KEY_SHOULD_BE_STRING_OR_NUMBER",
    "NATIVE_INDEXER_WRONG_PARAMETER_COUNT",
    "NATIVE_INDEXER_CAN_NOT_HAVE_DEFAULT_ARGUMENTS",
    "NATIVE_GETTER_RETURN_TYPE_SHOULD_BE_NULLABLE",
    "NATIVE_SETTER_WRONG_RETURN_TYPE",
    "JS_NAME_IS_NOT_ON_ALL_ACCESSORS",
    "JS_NAME_PROHIBITED_FOR_NAMED_NATIVE",
    "JS_NAME_PROHIBITED_FOR_OVERRIDE",
    "JS_NAME_ON_PRIMARY_CONSTRUCTOR_PROHIBITED",
    "JS_NAME_ON_ACCESSOR_AND_PROPERTY",
    "JS_NAME_PROHIBITED_FOR_EXTENSION_PROPERTY",
    "JS_BUILTIN_NAME_CLASH",
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "JS_FAKE_NAME_CLASH",
    "WRONG_JS_QUALIFIER",
    "OPT_IN_CAN_ONLY_BE_USED_AS_ANNOTATION",
    "OPT_IN_MARKER_CAN_ONLY_BE_USED_AS_ANNOTATION_OR_ARGUMENT_IN_OPT_IN",
    "OPT_IN_MARKER_WITH_WRONG_TARGET",
    "OPT_IN_MARKER_WITH_WRONG_RETENTION",
    "OPT_IN_MARKER_ON_WRONG_TARGET",
    "OPT_IN_MARKER_ON_OVERRIDE",
    "SUBCLASS_OPT_IN_INAPPLICABLE",
    "SUBCLASS_OPT_ARGUMENT_IS_NOT_MARKER",
    "EXPOSED_TYPEALIAS_EXPANDED_TYPE",
    "EXPOSED_FUNCTION_RETURN_TYPE",
    "EXPOSED_RECEIVER_TYPE",
    "EXPOSED_PROPERTY_TYPE",
    "EXPOSED_PARAMETER_TYPE",
    "EXPOSED_SUPER_INTERFACE",
    "EXPOSED_SUPER_CLASS",
    "EXPOSED_TYPE_PARAMETER_BOUND",
    "INAPPLICABLE_INFIX_MODIFIER",
    "REPEATED_MODIFIER",
    "DEPRECATED_MODIFIER",
    "INCOMPATIBLE_MODIFIERS",
    "WRONG_MODIFIER_TARGET",
    "OPERATOR_MODIFIER_REQUIRED",
    "OPERATOR_CALL_ON_CONSTRUCTOR",
    "INFIX_MODIFIER_REQUIRED",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "INAPPLICABLE_OPERATOR_MODIFIER",
    "NO_EXPLICIT_VISIBILITY_IN_API_MODE",
    "NO_EXPLICIT_RETURN_TYPE_IN_API_MODE",
    "ANONYMOUS_SUSPEND_FUNCTION",
    "VALUE_CLASS_NOT_TOP_LEVEL",
    "VALUE_CLASS_NOT_FINAL",
    "ABSENCE_OF_PRIMARY_CONSTRUCTOR_FOR_VALUE_CLASS",
    "INLINE_CLASS_CONSTRUCTOR_WRONG_PARAMETERS_SIZE",
    "VALUE_CLASS_EMPTY_CONSTRUCTOR",
    "VALUE_CLASS_CONSTRUCTOR_NOT_FINAL_READ_ONLY_PARAMETER",
    "PROPERTY_WITH_BACKING_FIELD_INSIDE_VALUE_CLASS",
    "DELEGATED_PROPERTY_INSIDE_VALUE_CLASS",
    "VALUE_CLASS_HAS_INAPPLICABLE_PARAMETER_TYPE",
    "VALUE_CLASS_CANNOT_IMPLEMENT_INTERFACE_BY_DELEGATION",
    "VALUE_CLASS_CANNOT_EXTEND_CLASSES",
    "VALUE_CLASS_CANNOT_BE_RECURSIVE",
    "MULTI_FIELD_VALUE_CLASS_PRIMARY_CONSTRUCTOR_DEFAULT_PARAMETER",
    "SECONDARY_CONSTRUCTOR_WITH_BODY_INSIDE_VALUE_CLASS",
    "RESERVED_MEMBER_INSIDE_VALUE_CLASS",
    "RESERVED_MEMBER_FROM_INTERFACE_INSIDE_VALUE_CLASS",
    "TYPE_ARGUMENT_ON_TYPED_VALUE_CLASS_EQUALS",
    "INNER_CLASS_INSIDE_VALUE_CLASS",
    "VALUE_CLASS_CANNOT_BE_CLONEABLE",
    "VALUE_CLASS_CANNOT_HAVE_CONTEXT_RECEIVERS",
    "ANNOTATION_ON_ILLEGAL_MULTI_FIELD_VALUE_CLASS_TYPED_TARGET",
    "NONE_APPLICABLE",
    "INAPPLICABLE_CANDIDATE",
    "TYPE_MISMATCH",
    "TYPE_INFERENCE_ONLY_INPUT_TYPES_ERROR",
    "THROWABLE_TYPE_MISMATCH",
    "CONDITION_TYPE_MISMATCH",
    "ARGUMENT_TYPE_MISMATCH",
    "NULL_FOR_NONNULL_TYPE",
    "INAPPLICABLE_LATEINIT_MODIFIER",
    "VARARG_OUTSIDE_PARENTHESES",
    "NAMED_ARGUMENTS_NOT_ALLOWED",
    "NON_VARARG_SPREAD",
    "ARGUMENT_PASSED_TWICE",
    "TOO_MANY_ARGUMENTS",
    "NO_VALUE_FOR_PARAMETER",
    "NAMED_PARAMETER_NOT_FOUND",
    "NAME_FOR_AMBIGUOUS_PARAMETER",
    "ASSIGNMENT_TYPE_MISMATCH",
    "RESULT_TYPE_MISMATCH",
    "MANY_LAMBDA_EXPRESSION_ARGUMENTS",
    "NEW_INFERENCE_NO_INFORMATION_FOR_PARAMETER",
    "SPREAD_OF_NULLABLE",
    "INFERENCE_UNSUCCESSFUL_FORK",
    "NESTED_CLASS_ACCESSED_VIA_INSTANCE_REFERENCE",
    "OVERLOAD_RESOLUTION_AMBIGUITY",
    "ASSIGN_OPERATOR_AMBIGUITY",
    "ITERATOR_AMBIGUITY",
    "HAS_NEXT_FUNCTION_AMBIGUITY",
    "NEXT_AMBIGUITY",
    "AMBIGUOUS_FUNCTION_TYPE_KIND",
    "NO_CONTEXT_RECEIVER",
    "MULTIPLE_ARGUMENTS_APPLICABLE_FOR_CONTEXT_RECEIVER",
    "AMBIGUOUS_CALL_WITH_IMPLICIT_CONTEXT_RECEIVER",
    "UNSUPPORTED_CONTEXTUAL_DECLARATION_CALL",
    "SUBTYPING_BETWEEN_CONTEXT_RECEIVERS",
    "CONTEXT_RECEIVERS_WITH_BACKING_FIELD",
    "RECURSION_IN_IMPLICIT_TYPES",
    "INFERENCE_ERROR",
    "PROJECTION_ON_NON_CLASS_TYPE_ARGUMENT",
    "UPPER_BOUND_VIOLATED",
    "UPPER_BOUND_VIOLATED_IN_TYPEALIAS_EXPANSION",
    "TYPE_ARGUMENTS_NOT_ALLOWED",
    "TYPE_ARGUMENTS_FOR_OUTER_CLASS_WHEN_NESTED_REFERENCED",
    "WRONG_NUMBER_OF_TYPE_ARGUMENTS",
    "NO_TYPE_ARGUMENTS_ON_RHS",
    "OUTER_CLASS_ARGUMENTS_REQUIRED",
    "TYPE_PARAMETERS_IN_OBJECT",
    "TYPE_PARAMETERS_IN_ANONYMOUS_OBJECT",
    "ILLEGAL_PROJECTION_USAGE",
    "TYPE_PARAMETERS_IN_ENUM",
    "CONFLICTING_PROJECTION",
    "CONFLICTING_PROJECTION_IN_TYPEALIAS_EXPANSION",
    "VARIANCE_ON_TYPE_PARAMETER_NOT_ALLOWED",
    "CATCH_PARAMETER_WITH_DEFAULT_VALUE",
    "REIFIED_TYPE_IN_CATCH_CLAUSE",
    "TYPE_PARAMETER_IN_CATCH_CLAUSE",
    "GENERIC_THROWABLE_SUBCLASS",
    "INNER_CLASS_OF_GENERIC_THROWABLE_SUBCLASS",
    "KCLASS_WITH_NULLABLE_TYPE_PARAMETER_IN_SIGNATURE",
    "TYPE_PARAMETER_AS_REIFIED",
    "REIFIED_TYPE_FORBIDDEN_SUBSTITUTION",
    "DEFINITELY_NON_NULLABLE_AS_REIFIED",
    "UPPER_BOUND_IS_EXTENSION_FUNCTION_TYPE",
    "BOUNDS_NOT_ALLOWED_IF_BOUNDED_BY_TYPE_PARAMETER",
    "ONLY_ONE_CLASS_BOUND_ALLOWED",
    "REPEATED_BOUND",
    "CONFLICTING_UPPER_BOUNDS",
    "NAME_IN_CONSTRAINT_IS_NOT_A_TYPE_PARAMETER",
    "BOUND_ON_TYPE_ALIAS_PARAMETER_NOT_ALLOWED",
    "REIFIED_TYPE_PARAMETER_NO_INLINE",
    "TYPE_PARAMETERS_NOT_ALLOWED",
    "TYPE_PARAMETER_OF_PROPERTY_NOT_USED_IN_RECEIVER",
    "RETURN_TYPE_MISMATCH",
    "IMPLICIT_NOTHING_RETURN_TYPE",
    "IMPLICIT_NOTHING_PROPERTY_TYPE",
    "CYCLIC_GENERIC_UPPER_BOUND",
    "FINITE_BOUNDS_VIOLATION",
    "EXPANSIVE_INHERITANCE",
    "DEPRECATED_TYPE_PARAMETER_SYNTAX",
    "DYNAMIC_SUPERTYPE",
    "DYNAMIC_UPPER_BOUND",
    "DYNAMIC_RECEIVER_NOT_ALLOWED",
    "DYNAMIC_RECEIVER_EXPECTED_BUT_WAS_NON_DYNAMIC",
    "INCOMPATIBLE_TYPES",
    "TYPE_VARIANCE_CONFLICT_ERROR",
    "TYPE_VARIANCE_CONFLICT_IN_EXPANDED_TYPE",
    "SMARTCAST_IMPOSSIBLE",
    "SMARTCAST_IMPOSSIBLE_ON_IMPLICIT_INVOKE_RECEIVER",
    "INCORRECT_LEFT_COMPONENT_OF_INTERSECTION",
    "INCORRECT_RIGHT_COMPONENT_OF_INTERSECTION",
    "NULLABLE_ON_DEFINITELY_NOT_NULLABLE",
    "EXTENSION_IN_CLASS_REFERENCE_NOT_ALLOWED",
    "CALLABLE_REFERENCE_LHS_NOT_A_CLASS",
    "CALLABLE_REFERENCE_TO_ANNOTATION_CONSTRUCTOR",
    "ADAPTED_CALLABLE_REFERENCE_AGAINST_REFLECTION_TYPE",
    "CLASS_LITERAL_LHS_NOT_A_CLASS",
    "NULLABLE_TYPE_IN_CLASS_LITERAL_LHS",
    "EXPRESSION_OF_NULLABLE_TYPE_IN_CLASS_LITERAL_LHS",
    "UNSUPPORTED_CLASS_LITERALS_WITH_EMPTY_LHS",
    "NOTHING_TO_OVERRIDE",
    "CANNOT_OVERRIDE_INVISIBLE_MEMBER",
    "DATA_CLASS_OVERRIDE_CONFLICT",
    "DATA_CLASS_OVERRIDE_DEFAULT_VALUES",
    "CANNOT_WEAKEN_ACCESS_PRIVILEGE",
    "CANNOT_CHANGE_ACCESS_PRIVILEGE",
    "CANNOT_INFER_VISIBILITY",
    "MULTIPLE_DEFAULTS_INHERITED_FROM_SUPERTYPES",
    "MULTIPLE_DEFAULTS_INHERITED_FROM_SUPERTYPES_WHEN_NO_EXPLICIT_OVERRIDE",
    "TYPEALIAS_EXPANDS_TO_ARRAY_OF_NOTHINGS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_INHERITANCE",
    "PROPERTY_TYPE_MISMATCH_ON_INHERITANCE",
    "VAR_TYPE_MISMATCH_ON_INHERITANCE",
    "RETURN_TYPE_MISMATCH_BY_DELEGATION",
    "PROPERTY_TYPE_MISMATCH_BY_DELEGATION",
    "VAR_OVERRIDDEN_BY_VAL_BY_DELEGATION",
    "CONFLICTING_INHERITED_MEMBERS",
    "ABSTRACT_MEMBER_NOT_IMPLEMENTED",
    "ABSTRACT_MEMBER_NOT_IMPLEMENTED_BY_ENUM_ENTRY",
    "ABSTRACT_CLASS_MEMBER_NOT_IMPLEMENTED",
    "AMBIGUOUS_ANONYMOUS_TYPE_INFERRED",
    "MANY_IMPL_MEMBER_NOT_IMPLEMENTED",
    "MANY_INTERFACES_MEMBER_NOT_IMPLEMENTED",
    "OVERRIDING_FINAL_MEMBER_BY_DELEGATION",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "PROPERTY_TYPE_MISMATCH_ON_OVERRIDE",
    "VAR_TYPE_MISMATCH_ON_OVERRIDE",
    "VAR_OVERRIDDEN_BY_VAL",
    "VIRTUAL_MEMBER_HIDDEN",
    "MANY_COMPANION_OBJECTS",
    "CONFLICTING_OVERLOADS",
    "REDECLARATION",
    "CLASSIFIER_REDECLARATION",
    "PACKAGE_CONFLICTS_WITH_CLASSIFIER",
    "EXPECT_AND_ACTUAL_IN_THE_SAME_MODULE",
    "METHOD_OF_ANY_IMPLEMENTED_IN_INTERFACE",
    "LOCAL_OBJECT_NOT_ALLOWED",
    "LOCAL_INTERFACE_NOT_ALLOWED",
    "ABSTRACT_FUNCTION_IN_NON_ABSTRACT_CLASS",
    "ABSTRACT_FUNCTION_WITH_BODY",
    "NON_ABSTRACT_FUNCTION_WITH_NO_BODY",
    "PRIVATE_FUNCTION_WITH_NO_BODY",
    "NON_MEMBER_FUNCTION_NO_BODY",
    "FUNCTION_DECLARATION_WITH_NO_NAME",
    "ANONYMOUS_FUNCTION_WITH_NAME",
    "ANONYMOUS_FUNCTION_PARAMETER_WITH_DEFAULT_VALUE",
    "MULTIPLE_VARARG_PARAMETERS",
    "FORBIDDEN_VARARG_PARAMETER_TYPE",
    "VALUE_PARAMETER_WITHOUT_EXPLICIT_TYPE",
    "CANNOT_INFER_PARAMETER_TYPE",
    "TAILREC_ON_VIRTUAL_MEMBER_ERROR",
    "DATA_OBJECT_CUSTOM_EQUALS_OR_HASH_CODE",
    "DEFAULT_VALUE_NOT_ALLOWED_IN_OVERRIDE",
    "FUN_INTERFACE_CONSTRUCTOR_REFERENCE",
    "FUN_INTERFACE_WRONG_COUNT_OF_ABSTRACT_MEMBERS",
    "FUN_INTERFACE_CANNOT_HAVE_ABSTRACT_PROPERTIES",
    "FUN_INTERFACE_ABSTRACT_METHOD_WITH_TYPE_PARAMETERS",
    "FUN_INTERFACE_ABSTRACT_METHOD_WITH_DEFAULT_VALUE",
    "FUN_INTERFACE_WITH_SUSPEND_FUNCTION",
    "ABSTRACT_PROPERTY_IN_NON_ABSTRACT_CLASS",
    "PRIVATE_PROPERTY_IN_INTERFACE",
    "ABSTRACT_PROPERTY_WITH_INITIALIZER",
    "PROPERTY_INITIALIZER_IN_INTERFACE",
    "PROPERTY_WITH_NO_TYPE_NO_INITIALIZER",
    "ABSTRACT_PROPERTY_WITHOUT_TYPE",
    "LATEINIT_PROPERTY_WITHOUT_TYPE",
    "MUST_BE_INITIALIZED",
    "MUST_BE_INITIALIZED_OR_BE_FINAL",
    "MUST_BE_INITIALIZED_OR_BE_ABSTRACT",
    "MUST_BE_INITIALIZED_OR_FINAL_OR_ABSTRACT",
    "EXTENSION_PROPERTY_MUST_HAVE_ACCESSORS_OR_BE_ABSTRACT",
    "BACKING_FIELD_IN_INTERFACE",
    "EXTENSION_PROPERTY_WITH_BACKING_FIELD",
    "PROPERTY_INITIALIZER_NO_BACKING_FIELD",
    "ABSTRACT_DELEGATED_PROPERTY",
    "DELEGATED_PROPERTY_IN_INTERFACE",
    "ABSTRACT_PROPERTY_WITH_GETTER",
    "ABSTRACT_PROPERTY_WITH_SETTER",
    "PRIVATE_SETTER_FOR_ABSTRACT_PROPERTY",
    "PRIVATE_SETTER_FOR_OPEN_PROPERTY",
    "VAL_WITH_SETTER",
    "CONST_VAL_NOT_TOP_LEVEL_OR_OBJECT",
    "CONST_VAL_WITH_GETTER",
    "CONST_VAL_WITH_DELEGATE",
    "TYPE_CANT_BE_USED_FOR_CONST_VAL",
    "CONST_VAL_WITHOUT_INITIALIZER",
    "CONST_VAL_WITH_NON_CONST_INITIALIZER",
    "WRONG_SETTER_PARAMETER_TYPE",
    "INITIALIZER_TYPE_MISMATCH",
    "GETTER_VISIBILITY_DIFFERS_FROM_PROPERTY_VISIBILITY",
    "SETTER_VISIBILITY_INCONSISTENT_WITH_PROPERTY_VISIBILITY",
    "WRONG_SETTER_RETURN_TYPE",
    "WRONG_GETTER_RETURN_TYPE",
    "ACCESSOR_FOR_DELEGATED_PROPERTY",
    "PROPERTY_INITIALIZER_WITH_EXPLICIT_FIELD_DECLARATION",
    "PROPERTY_FIELD_DECLARATION_MISSING_INITIALIZER",
    "LATEINIT_PROPERTY_FIELD_DECLARATION_WITH_INITIALIZER",
    "LATEINIT_FIELD_IN_VAL_PROPERTY",
    "LATEINIT_NULLABLE_BACKING_FIELD",
    "BACKING_FIELD_FOR_DELEGATED_PROPERTY",
    "PROPERTY_MUST_HAVE_GETTER",
    "PROPERTY_MUST_HAVE_SETTER",
    "EXPLICIT_BACKING_FIELD_IN_INTERFACE",
    "EXPLICIT_BACKING_FIELD_IN_ABSTRACT_PROPERTY",
    "EXPLICIT_BACKING_FIELD_IN_EXTENSION",
    "ABSTRACT_PROPERTY_IN_PRIMARY_CONSTRUCTOR_PARAMETERS",
    "LOCAL_VARIABLE_WITH_TYPE_PARAMETERS",
    "EXPLICIT_TYPE_ARGUMENTS_IN_PROPERTY_ACCESS",
    "SAFE_CALLABLE_REFERENCE_CALL",
    "LATEINIT_INTRINSIC_CALL_ON_NON_LITERAL",
    "LATEINIT_INTRINSIC_CALL_ON_NON_LATEINIT",
    "LATEINIT_INTRINSIC_CALL_IN_INLINE_FUNCTION",
    "LATEINIT_INTRINSIC_CALL_ON_NON_ACCESSIBLE_PROPERTY",
    "LOCAL_EXTENSION_PROPERTY",
    "EXPECTED_DECLARATION_WITH_BODY",
    "EXPECTED_CLASS_CONSTRUCTOR_DELEGATION_CALL",
    "EXPECTED_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
    "EXPECTED_ENUM_CONSTRUCTOR",
    "EXPECTED_ENUM_ENTRY_WITH_BODY",
    "EXPECTED_PROPERTY_INITIALIZER",
    "EXPECTED_DELEGATED_PROPERTY",
    "EXPECTED_LATEINIT_PROPERTY",
    "SUPERTYPE_INITIALIZED_IN_EXPECTED_CLASS",
    "EXPECTED_PRIVATE_DECLARATION",
    "EXPECTED_EXTERNAL_DECLARATION",
    "EXPECTED_TAILREC_FUNCTION",
    "IMPLEMENTATION_BY_DELEGATION_IN_EXPECT_CLASS",
    "ACTUAL_TYPE_ALIAS_NOT_TO_CLASS",
    "ACTUAL_TYPE_ALIAS_TO_CLASS_WITH_DECLARATION_SITE_VARIANCE",
    "ACTUAL_TYPE_ALIAS_WITH_USE_SITE_VARIANCE",
    "ACTUAL_TYPE_ALIAS_WITH_COMPLEX_SUBSTITUTION",
    "ACTUAL_TYPE_ALIAS_TO_NULLABLE_TYPE",
    "ACTUAL_TYPE_ALIAS_TO_NOTHING",
    "ACTUAL_FUNCTION_WITH_DEFAULT_ARGUMENTS",
    "DEFAULT_ARGUMENTS_IN_EXPECT_WITH_ACTUAL_TYPEALIAS",
    "DEFAULT_ARGUMENTS_IN_EXPECT_ACTUALIZED_BY_FAKE_OVERRIDE",
    "EXPECTED_FUNCTION_SOURCE_WITH_DEFAULT_ARGUMENTS_NOT_FOUND",
    "ACTUAL_WITHOUT_EXPECT",
    "AMBIGUOUS_EXPECTS",
    "NO_ACTUAL_CLASS_MEMBER_FOR_EXPECTED_CLASS",
    "ACTUAL_MISSING",
    "NOT_A_MULTIPLATFORM_COMPILATION",
    "EXPECT_ACTUAL_OPT_IN_ANNOTATION",
    "ACTUAL_TYPEALIAS_TO_SPECIAL_ANNOTATION",
    "OPTIONAL_DECLARATION_OUTSIDE_OF_ANNOTATION_ENTRY",
    "OPTIONAL_DECLARATION_USAGE_IN_NON_COMMON_SOURCE",
    "OPTIONAL_EXPECTATION_NOT_ON_EXPECTED",
    "INITIALIZER_REQUIRED_FOR_DESTRUCTURING_DECLARATION",
    "COMPONENT_FUNCTION_MISSING",
    "COMPONENT_FUNCTION_AMBIGUITY",
    "COMPONENT_FUNCTION_ON_NULLABLE",
    "COMPONENT_FUNCTION_RETURN_TYPE_MISMATCH",
    "UNINITIALIZED_VARIABLE",
    "UNINITIALIZED_PARAMETER",
    "UNINITIALIZED_ENUM_ENTRY",
    "UNINITIALIZED_ENUM_COMPANION",
    "VAL_REASSIGNMENT",
    "CAPTURED_VAL_INITIALIZATION",
    "CAPTURED_MEMBER_VAL_INITIALIZATION",
    "NON_INLINE_MEMBER_VAL_INITIALIZATION",
    "SETTER_PROJECTED_OUT",
    "VARIABLE_WITH_NO_TYPE_NO_INITIALIZER",
    "INITIALIZATION_BEFORE_DECLARATION",
    "TYPECHECKER_HAS_RUN_INTO_RECURSIVE_PROBLEM",
    "UNSAFE_CALL",
    "UNSAFE_IMPLICIT_INVOKE_CALL",
    "UNSAFE_INFIX_CALL",
    "UNSAFE_OPERATOR_CALL",
    "ITERATOR_ON_NULLABLE",
    "UNEXPECTED_SAFE_CALL",
    "CANNOT_CHECK_FOR_ERASED",
    "IS_ENUM_ENTRY",
    "DYNAMIC_NOT_ALLOWED",
    "ENUM_ENTRY_AS_TYPE",
    "EXPECTED_CONDITION",
    "NO_ELSE_IN_WHEN",
    "INVALID_IF_AS_EXPRESSION",
    "ELSE_MISPLACED_IN_WHEN",
    "ILLEGAL_DECLARATION_IN_WHEN_SUBJECT",
    "COMMA_IN_WHEN_CONDITION_WITHOUT_ARGUMENT",
    "COMMA_IN_WHEN_CONDITION_WITH_WHEN_GUARD",
    "WHEN_GUARD_WITHOUT_SUBJECT",
    "TYPE_PARAMETER_IS_NOT_AN_EXPRESSION",
    "TYPE_PARAMETER_ON_LHS_OF_DOT",
    "NO_COMPANION_OBJECT",
    "EXPRESSION_EXPECTED_PACKAGE_FOUND",
    "ERROR_IN_CONTRACT_DESCRIPTION",
    "CONTRACT_NOT_ALLOWED",
    "NO_GET_METHOD",
    "NO_SET_METHOD",
    "ITERATOR_MISSING",
    "HAS_NEXT_MISSING",
    "NEXT_MISSING",
    "HAS_NEXT_FUNCTION_NONE_APPLICABLE",
    "NEXT_NONE_APPLICABLE",
    "DELEGATE_SPECIAL_FUNCTION_MISSING",
    "DELEGATE_SPECIAL_FUNCTION_AMBIGUITY",
    "DELEGATE_SPECIAL_FUNCTION_NONE_APPLICABLE",
    "DELEGATE_SPECIAL_FUNCTION_RETURN_TYPE_MISMATCH",
    "UNDERSCORE_IS_RESERVED",
    "UNDERSCORE_USAGE_WITHOUT_BACKTICKS",
    "INVALID_CHARACTERS",
    "EQUALITY_NOT_APPLICABLE",
    "INCOMPATIBLE_ENUM_COMPARISON_ERROR",
    "FORBIDDEN_IDENTITY_EQUALS",
    "INC_DEC_SHOULD_NOT_RETURN_UNIT",
    "ASSIGNMENT_OPERATOR_SHOULD_RETURN_UNIT",
    "NOT_FUNCTION_AS_OPERATOR",
    "DSL_SCOPE_VIOLATION",
    "TOPLEVEL_TYPEALIASES_ONLY",
    "RECURSIVE_TYPEALIAS_EXPANSION",
    "TYPEALIAS_SHOULD_EXPAND_TO_CLASS",
    "RETURN_NOT_ALLOWED",
    "NOT_A_FUNCTION_LABEL",
    "RETURN_IN_FUNCTION_WITH_EXPRESSION_BODY",
    "NO_RETURN_IN_FUNCTION_WITH_BLOCK_BODY",
    "ANONYMOUS_INITIALIZER_IN_INTERFACE",
    "USAGE_IS_NOT_INLINABLE",
    "NON_LOCAL_RETURN_NOT_ALLOWED",
    "NOT_YET_SUPPORTED_IN_INLINE",
    "NULLABLE_INLINE_PARAMETER",
    "RECURSION_IN_INLINE",
    "NON_PUBLIC_CALL_FROM_PUBLIC_INLINE",
    "NON_PUBLIC_INLINE_CALL_FROM_PUBLIC_INLINE",
    "PROTECTED_CONSTRUCTOR_CALL_FROM_PUBLIC_INLINE",
    "PROTECTED_CALL_FROM_PUBLIC_INLINE_ERROR",
    "PRIVATE_CLASS_MEMBER_FROM_INLINE",
    "SUPER_CALL_FROM_PUBLIC_INLINE",
    "DECLARATION_CANT_BE_INLINED",
    "NON_INTERNAL_PUBLISHED_API",
    "INVALID_DEFAULT_FUNCTIONAL_PARAMETER_FOR_INLINE",
    "NOT_SUPPORTED_INLINE_PARAMETER_IN_INLINE_PARAMETER_DEFAULT_VALUE",
    "REIFIED_TYPE_PARAMETER_IN_OVERRIDE",
    "INLINE_PROPERTY_WITH_BACKING_FIELD",
    "ILLEGAL_INLINE_PARAMETER_MODIFIER",
    "INLINE_SUSPEND_FUNCTION_TYPE_UNSUPPORTED",
    "INLINE_FROM_HIGHER_PLATFORM",
    "CANNOT_ALL_UNDER_IMPORT_FROM_SINGLETON",
    "PACKAGE_CANNOT_BE_IMPORTED",
    "CANNOT_BE_IMPORTED",
    "CONFLICTING_IMPORT",
    "OPERATOR_RENAMED_ON_IMPORT",
    "ILLEGAL_SUSPEND_FUNCTION_CALL",
    "ILLEGAL_SUSPEND_PROPERTY_ACCESS",
    "NON_LOCAL_SUSPENSION_POINT",
    "ILLEGAL_RESTRICTED_SUSPENDING_FUNCTION_CALL",
    "NON_MODIFIER_FORM_FOR_BUILT_IN_SUSPEND",
    "MODIFIER_FORM_FOR_NON_BUILT_IN_SUSPEND",
    "RETURN_FOR_BUILT_IN_SUSPEND",
    "MIXING_SUSPEND_AND_NON_SUSPEND_SUPERTYPES",
    "MIXING_FUNCTIONAL_KINDS_IN_SUPERTYPES",
    "MULTIPLE_LABELS_ARE_FORBIDDEN",
    "INCOMPATIBLE_CLASS",
    "PRE_RELEASE_CLASS",
    "IR_WITH_UNSTABLE_ABI_COMPILED_CLASS",
    "BUILDER_INFERENCE_STUB_RECEIVER",
    "BUILDER_INFERENCE_MULTI_LAMBDA_RESTRICTION",
    "OVERRIDE_CANNOT_BE_STATIC",
    "JVM_STATIC_NOT_IN_OBJECT_OR_CLASS_COMPANION",
    "JVM_STATIC_NOT_IN_OBJECT_OR_COMPANION",
    "JVM_STATIC_ON_NON_PUBLIC_MEMBER",
    "JVM_STATIC_ON_CONST_OR_JVM_FIELD",
    "JVM_STATIC_ON_EXTERNAL_IN_INTERFACE",
    "ILLEGAL_JVM_NAME",
    "FUNCTION_DELEGATE_MEMBER_NAME_CLASH",
    "VALUE_CLASS_WITHOUT_JVM_INLINE_ANNOTATION",
    "JVM_INLINE_WITHOUT_VALUE_CLASS",
    "ACCIDENTAL_OVERRIDE_CLASH_BY_JVM_SIGNATURE",
    "NOT_YET_SUPPORTED_LOCAL_INLINE_FUNCTION",
    "JAVA_TYPE_MISMATCH",
    "UPPER_BOUND_CANNOT_BE_ARRAY",
    "STRICTFP_ON_CLASS",
    "SYNCHRONIZED_ON_ABSTRACT",
    "SYNCHRONIZED_IN_INTERFACE",
    "OVERLOADS_ABSTRACT",
    "OVERLOADS_INTERFACE",
    "OVERLOADS_LOCAL",
    "JVM_PACKAGE_NAME_CANNOT_BE_EMPTY",
    "JVM_PACKAGE_NAME_MUST_BE_VALID_NAME",
    "JVM_PACKAGE_NAME_NOT_SUPPORTED_IN_FILES_WITH_CLASSES",
    "POSITIONED_VALUE_ARGUMENT_FOR_JAVA_ANNOTATION",
    "LOCAL_JVM_RECORD",
    "NON_FINAL_JVM_RECORD",
    "ENUM_JVM_RECORD",
    "JVM_RECORD_WITHOUT_PRIMARY_CONSTRUCTOR_PARAMETERS",
    "NON_DATA_CLASS_JVM_RECORD",
    "JVM_RECORD_NOT_VAL_PARAMETER",
    "JVM_RECORD_NOT_LAST_VARARG_PARAMETER",
    "INNER_JVM_RECORD",
    "FIELD_IN_JVM_RECORD",
    "DELEGATION_BY_IN_JVM_RECORD",
    "JVM_RECORD_EXTENDS_CLASS",
    "ILLEGAL_JAVA_LANG_RECORD_SUPERTYPE",
    "JAVA_MODULE_DOES_NOT_DEPEND_ON_MODULE",
    "JAVA_MODULE_DOES_NOT_READ_UNNAMED_MODULE",
    "JVM_DEFAULT_IN_DECLARATION",
    "JVM_DEFAULT_WITH_COMPATIBILITY_IN_DECLARATION",
    "JVM_DEFAULT_WITH_COMPATIBILITY_NOT_ON_INTERFACE",
    "EXTERNAL_DECLARATION_CANNOT_BE_ABSTRACT",
    "EXTERNAL_DECLARATION_CANNOT_HAVE_BODY",
    "EXTERNAL_DECLARATION_IN_INTERFACE",
    "EXTERNAL_DECLARATION_CANNOT_BE_INLINED",
    "NON_SOURCE_REPEATED_ANNOTATION",
    "REPEATED_ANNOTATION_WITH_CONTAINER",
    "SUSPENSION_POINT_INSIDE_CRITICAL_SECTION",
    "INAPPLICABLE_JVM_FIELD",
    "JVM_SYNTHETIC_ON_DELEGATE",
    "SUBCLASS_CANT_CALL_COMPANION_PROTECTED_NON_STATIC",
    "JAVA_SAM_INTERFACE_CONSTRUCTOR_REFERENCE",
    "JAVA_FIELD_SHADOWED_BY_KOTLIN_PROPERTY",
    "IMPLEMENTING_FUNCTION_INTERFACE",
    "OVERRIDING_EXTERNAL_FUN_WITH_OPTIONAL_PARAMS",
    "OVERRIDING_EXTERNAL_FUN_WITH_OPTIONAL_PARAMS_WITH_FAKE",
    "CALL_TO_DEFINED_EXTERNALLY_FROM_NON_EXTERNAL_DECLARATION",
    "EXTERNAL_ENUM_ENTRY_WITH_BODY",
    "EXTERNAL_TYPE_EXTENDS_NON_EXTERNAL_TYPE",
    "INLINE_CLASS_IN_EXTERNAL_DECLARATION",
    "EXTENSION_FUNCTION_IN_EXTERNAL_DECLARATION",
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "JS_EXTERNAL_INHERITORS_ONLY",
    "JS_EXTERNAL_ARGUMENT",
    "WRONG_EXPORTED_DECLARATION",
    "NAMED_COMPANION_IN_EXPORTED_INTERFACE",
    "NESTED_JS_EXPORT",
    "DELEGATION_BY_DYNAMIC",
    "PROPERTY_DELEGATION_BY_DYNAMIC",
    "SPREAD_OPERATOR_IN_DYNAMIC_CALL",
    "WRONG_OPERATION_WITH_DYNAMIC",
    "JS_STATIC_NOT_IN_CLASS_COMPANION",
    "JS_STATIC_ON_NON_PUBLIC_MEMBER",
    "JS_STATIC_ON_CONST",
    "JS_STATIC_ON_OVERRIDE",
    "THROWS_LIST_EMPTY",
    "INCOMPATIBLE_THROWS_OVERRIDE",
    "INCOMPATIBLE_THROWS_INHERITED",
    "MISSING_EXCEPTION_IN_THROWS_ON_SUSPEND",
    "INAPPLICABLE_SHARED_IMMUTABLE_PROPERTY",
    "INAPPLICABLE_SHARED_IMMUTABLE_TOP_LEVEL",
    "INAPPLICABLE_THREAD_LOCAL",
    "INAPPLICABLE_THREAD_LOCAL_TOP_LEVEL",
    "REDUNDANT_SWIFT_REFINEMENT",
    "INCOMPATIBLE_OBJC_REFINEMENT_OVERRIDE",
    "INAPPLICABLE_OBJC_NAME",
    "INVALID_OBJC_NAME",
    "INVALID_OBJC_NAME_CHARS",
    "INVALID_OBJC_NAME_FIRST_CHAR",
    "EMPTY_OBJC_NAME",
    "INCOMPATIBLE_OBJC_NAME_OVERRIDE",
    "INAPPLICABLE_EXACT_OBJC_NAME",
    "MISSING_EXACT_OBJC_NAME",
    "NON_LITERAL_OBJC_NAME_ARG",
    "INVALID_OBJC_HIDES_TARGETS",
    "INVALID_REFINES_IN_SWIFT_TARGETS",
    "SUBTYPE_OF_HIDDEN_FROM_OBJC",
    "CANNOT_CHECK_FOR_FORWARD_DECLARATION",
    "FORWARD_DECLARATION_AS_REIFIED_TYPE_ARGUMENT",
    "FORWARD_DECLARATION_AS_CLASS_LITERAL",
    "TWO_OR_LESS_PARAMETERS_ARE_SUPPORTED_HERE",
    "PROPERTY_MUST_BE_VAR",
    "MUST_NOT_HAVE_EXTENSION_RECEIVER",
    "MUST_BE_OBJC_OBJECT_TYPE",
    "MUST_BE_UNIT_TYPE",
    "CONSTRUCTOR_OVERRIDES_ALREADY_OVERRIDDEN_OBJC_INITIALIZER",
    "CONSTRUCTOR_DOES_NOT_OVERRIDE_ANY_SUPER_CONSTRUCTOR",
    "CONSTRUCTOR_MATCHES_SEVERAL_SUPER_CONSTRUCTORS",
    "CONFLICTING_OBJC_OVERLOADS",
    "INAPPLICABLE_OBJC_OVERRIDE",
    "NESTED_EXTERNAL_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
    "INLINE_EXTERNAL_DECLARATION",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
    "EXTERNAL_ANONYMOUS_INITIALIZER",
    "EXTERNAL_DELEGATION",
    "EXTERNAL_DELEGATED_CONSTRUCTOR_CALL",
    "WRONG_BODY_OF_EXTERNAL_DECLARATION",
    "WRONG_INITIALIZER_OF_EXTERNAL_DECLARATION",
    "WRONG_DEFAULT_VALUE_FOR_EXTERNAL_FUN_PARAMETER",
    "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE",
    "EXTERNAL_INTERFACE_AS_CLASS_LITERAL",
    "EXTERNAL_INTERFACE_AS_REIFIED_TYPE_ARGUMENT",
    "NAMED_COMPANION_IN_EXTERNAL_INTERFACE",
    "JSCODE_ARGUMENT_NON_CONST_EXPRESSION",
    "SYNTAX",
)
