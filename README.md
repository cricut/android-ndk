# Android NDK docker action

This action outputs the Android NDK version used at Cricut.

## Outputs 

### `version`

The current NDK version used by the Android team at Cricut.

## Example usage
    - name: Android NDK Version
      id: ndk
      uses: cricut/android-ndk@main 

    - name: Get the output
      run: echo "The version is ${{ steps.ndk.output.version }}"


If you need the Android Pods to update the current NDK Version to make your library
compatible please contact a member of the Platform Pod.

