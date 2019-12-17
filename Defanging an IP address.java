class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".","[.]");
        /*can use replaceAll() too
    }
}
